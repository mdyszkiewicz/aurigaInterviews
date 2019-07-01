# aurigaInterviews

[{
"2b727991-5ddb-4a42-82eb-13bbb2876a28": { 
"agentVersion": "0.1.0",
"alertIds": ["0a45fa06-87ad-4ef7-ae30-f05d42beca22", "16597623-a5d1-4a21-8304-58c458aefd3b"],
"architecture": "x64",
"collector": {"tenantId": "496e3cfd-672c-47ae-9dfb-0d840b0aed80", "collectorId": "5316b276-18cc-4692-b89b-26ae22a0c4ef", "collectorName": "Test_Collector"},
"cpuModel": "Intel(R) Xeon(R) CPU E5-2673 v3 @ 2.40GHz",
"cpuNumber": 1,
"description": "Auriga Test Device",
"deviceId": "2b727991-5ddb-4a42-82eb-13bbb2876a28",
"discoveryDate": "2019-05-21T16:02:56.819",
"externalIp": "144.0.1.163",
"externalIpCordLat": "52.35",
"externalIpCordLong": "4.9167",
"externalIpDateUpdated": "2019-06-10T09:33:07.932",
"ipAddresses": [{"ipAddress": "1.0.0.4", "ipFamily": "IPv4", "macAddress": "01:1d:3a:20:da:2d"}],
"isAgentConnected": true,
"lastSeenDate": "2019-06-10T09:46:00.176Z",
"name": "AurigaDC01",
"osCode": "Windows_NT",
"platform": "win32",
"registeredDate": "2019-05-21T16:02:56.819",
"release": "6.3.9600",
"updatesScriptLastRun": "2019-06-10T09:24:10"
}}]


Assume that the above is the response that a public URL gives you: https://api.cybergator.co.uk/testing/devices  and you would like to consume the response from that URL and use it in your application.


Question:

Construct a HTTP Endpoint which retrieves the data from the URL I gave you above and returns a response to the client which will be: 
{
"agentVersion": "0.1.0",
"howManyAlerts": 2,
"architecture": "x64",
"collector": "Test_Collector",
"cpuModel": "Intel(R) Xeon(R) CPU E5-2673 v3 @ 2.40GHz",
"description": "Auriga Test Device",
"discoveryDate": "2019-05-21",
"externalIp": "144.0.1.163"
}

I want to see the way you think and approach a problem so please add comments wherever you think it will be useful. Please use Java and Spring Boot.
The result doesn’t have to be displayed in a UI, I would like to see up to the point that the response is returned from the endpoint.
**The url is not real so you don’t have to call it. The response is ready for you. However, I would like to see in the code how you would consume data from an external URL , so please make sure the call of the URL exists inside your code.




