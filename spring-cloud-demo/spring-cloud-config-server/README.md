## Spring Cloud Config Server

This Service reads projects configuration from a remote GIT repository and exposes this configuration in json format

From Spring Tool Suite "Run as Spring Boot App"

Then type the URL in the browser:

http://localhost:8888/test-service/default

This will read the configuration for the "default" profile and for the test-service client from remote config repo

