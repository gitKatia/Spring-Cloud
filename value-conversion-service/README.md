## Config Server client, registered with Eureka Server

It uses the unit-conversion-service via Open Feign declarative client

Example call:

http://localhost:8100/value-conversion/fromUnit/m/toUnit/mm/value/2

Should return 2000