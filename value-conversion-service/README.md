The service is a Config Server client and is registered with Eureka server
It uses the unit-conversion-service using Open Feign declarative client

Example call:

http://localhost:8100/value-conversion/fromUnit/m/toUnit/mm/value/2

Should return 2000