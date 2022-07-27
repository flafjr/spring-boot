# https://github.com/jupitercl/aws-localstack-terraform-sns-sqs-lambda/
resource "aws_sqs_queue" "test-sqs" {
  name = "test-sqs"
}