#!/bin/bash
TERRAFORM_FOUND="$(command -v terraform)"

if [ -z "$TERRAFORM_FOUND" ]
then
  brew tap hashicorp/tap
  brew install hashicorp/tap/terraform
else
  echo "Terraform already installed: $TERRAFORM_FOUND"
fi

pip3 install awscli-local