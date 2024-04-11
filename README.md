# REST API - MONGO /SPRING BOOT

Project initial URL
- http://localhost:8080/api/v1/


## EndPoints and Verbs: 

**GET** /materia 

- The Get method sends a request that obtains all available resources from the server.

**POST** /materia

- The POST method in HTTP is used to send data to a server to create a new resource.

```bash
  {
        "docente": "Nilson",
        "nombre": "Desarrollo",
        "curso": 5,
        "duracion_horas": 2,
        "salon": 319,
        "dias": [
            "Martes"
        ]
    }
```

**PUT** /materia

- It is used to update an existing resource on the server.

```bash
  { 
        "id": "66176b7c866b843024b2722b",
        "docente": "Nilson",
        "nombre": "Desarrollo",
        "curso": 5,
        "duracion_horas": 2,
        "salon": 319,
        "dias": [
            "Martes"
        ]
    }
```


**DELETE** /materia/{id}

- It is used to request the deletion of a specific resource on the server by means of its ID.


**PATCH** /materia/{id}

- The PATCH verb in HTTP is used to make partial modifications to an existing resource on the server.

```bash
    {  
        "nombre": "Desarrollo"
    }
```

**HEAD**

- The HEAD verb in HTTP is similar to the GET verb, but instead of retrieving the response body (the data for the requested resource), it only requests the response headers.

**OPTIONS**

- The OPTIONS verb in HTTP is used to request information about the communication options available to a specific resource or the server itself. When a client sends an OPTIONS request to a server, the server responds with a list of allowed HTTP methods, supported response headers, and other relevant details about the requested resource or the server in general.


**GET** /materia/{id}

- Get by id, is used to request a specific resource identified by its unique ID on the server. The client provides the unique identifier of the resource it wants to retrieve, and the server returns only that resource corresponding to that specific ID.

