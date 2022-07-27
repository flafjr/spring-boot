echo "--------------------------------------------------------------"
echo "SSM PARAM STORE: Register"
echo "--------------------------------------------------------------"

echo "POST foo"
aws ssm put-parameter --endpoint-url="http://localhost:4566" --region="us-east-1" \
--name "foo" \
--value "$(cat ./ssm/foo.json)" \
--type "String" \
--description "SSM by LocalStack"