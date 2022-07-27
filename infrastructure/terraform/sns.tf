# https://github.com/jupitercl/aws-localstack-terraform-sns-sqs-lambda/
resource "aws_sns_topic" "test-sns" {
  name = "test-sns"
}