provider "aws" {
  version                 = "~> 2.23"
  shared_credentials_file = "/Users/User-PC/.aws/credentials.txt"
  region                  = "us-east-1"
}
resource "aws_vpc" "main" {
  cidr_block = "10.0.0.0/16"

  tags = {
    Name = "AwsTesting"
  }
}
resource "aws_internet_gateway" "igw" {
  vpc_id = aws_vpc.main.id

  tags = {
    Name = "AwsTesting"
  }
}
resource "aws_default_route_table" "main" {
  default_route_table_id = aws_vpc.main.default_route_table_id

  route {
    cidr_block = "0.0.0.0/0"
    gateway_id = aws_internet_gateway.igw.id
  }

  tags = {
    Name = "AwsTesting"
  }
}
resource "aws_subnet" "public_az1" {
  vpc_id     = aws_vpc.main.id
  cidr_block = "10.0.1.0/22"
  availability_zone = "us-east-1a"
  map_public_ip_on_launch = true

  tags = {
    Name = "Public AZ1"
  }
}
resource "aws_security_group" "allow_http_ssh" {
  description = "Allow SSh and http inbound traffic"
  vpc_id      = aws_vpc.main.id

  ingress {
    description = "http from VPC"
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    description = "ssh from VPC"
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Name = "allow_http_ssh"
  }
}
resource "aws_placement_group" "test" {
  name     = "test"
  strategy = "cluster"
}

resource "aws_lb" "todo_app" {
  name               = "test-app-lb"
  internal           = false
  load_balancer_type = "application"
  security_groups    = [aws_security_group.allow_http_ssh.id]
  subnets            = [aws_subnet.public_az1.id]

  tags = {
    Environment = "production"
  }
}
