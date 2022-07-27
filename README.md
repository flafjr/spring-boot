# hotdog-localstack-PoC
PoC for running AWS services(kinesis, dynamodb, lambdas) locally with Localstack

https://dzone.com/articles/spring-boot-unit-test-your-project-architecture-wi
https://github.com/TNG/ArchUnit-Examples/tree/main/example-junit5/src/test/java/com/tngtech/archunit/exampletest/junit5
https://github.com/google/eng-practices/blob/master/review/reviewer/standard.md

```
alias awslocal="aws --endpoint-url=http://localhost:4566"
```

```
docker network create localstack-tutorial
docker-compose up -d --build
./zip-it.sh
terraform init
terraform apply --auto-approve
awslocal lambda list-functions
awslocal dynamodb list-tables
awslocal kinesis list-streams
```

Note: Make sure you are matching your AWS REGION in docker-compose.yml, terraform provider's region and session.NewSession(). They all need to be the same region.
