# https://github.com/jupitercl/aws-localstack-terraform-sns-sqs-lambda/
resource "aws_ssm_parameter" "foo" {
  name  = "foo"
  type  = "String"
  value = " "
}