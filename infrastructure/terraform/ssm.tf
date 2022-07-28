# https://registry.terraform.io/providers/hashicorp/aws/latest/docs/resources/ssm_parameter
resource "aws_ssm_parameter" "foo" {
  name  = "foo"
  type  = "String"
  value = " "
}