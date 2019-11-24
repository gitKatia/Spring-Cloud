## Config Server client, registered with Eureka Server

It uses the unit-conversion-service via Open Feign declarative client

Example call:

http://localhost:8100/value-conversion/fromUnit/m/toUnit/mm/value/2

Should return 2000

The service has a circuit breaker implemented using Hystrix. 

So when the unit-conversion-service is down provides a fallback response

Hystrix dashboard is available at:

http://localhost:8100/hystrix/

Here you need to specify which stream to monitor: http://localhost:8100/hystrix.stream