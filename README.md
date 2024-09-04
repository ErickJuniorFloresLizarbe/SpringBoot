# SpringBoot

- Paso 1 ingresamos a la plataforma Google AI Studio y ingresamos a la opcion Get API Key. Pulsamos la opcion de crear clave de api.
![imagen](imagen/paso_1.png)

- Paso 2 elegimos la primera opcion para que genere nuestra clave de api personal
![imagen](imagen/paso_2.png)

- Paso 3 pulsamos sobre la opcion que indeca la imagen 
![imagen](imagen/paso_3.png)

- Paso 4 luego nesecitamos copiar clave que nos genera. Es muy importante esta clave para funcione correctamente la api que usaremos de gemini
![imagen](imagen/paso_4.png)

- Paso 5 Ingresamos a postman creamos un metodo post y pegamos el link de gemini. Luego ingresamos a la opcion Params pegamos nuestra clave Key
![imagen](imagen/paso_5.png)

- Paso 6 Luego ingresamos a la opcion body y escogemos el formato raw. Luego escribimos una consulta a la api haci como muestra la imagen del ejemplo
![imagen](imagen/paso_6.0.png)

- Paso 7 Luego en la opcion  </> copiamos el codigo que nos genera postman
![imagen](imagen/paso_6.1.png)

- Paso 8 Luego lo implemetamos en nuestro spring boot, con un service y controller. Luego lo ejecutamos y hacemos las prubas necesarias en el postman
![imagen](imagen/paso_7.png)

- Paso 9 creamos un metodo post y hacemos uso de nuestra url que destinamos usar para hacer consultas a la inteligencia artificial. Luego hacemos una consulta como se muestra en la imagen.
![imagen](imagen/paso_8.png)
 
- Paso 10 creamos un metodo get y hacemos uso de nuestra url que destinamos para que muestre nuestro historial de consultas.
![imagen](imagen/paso_9.png)

- Paso 11 tambien podemos usar en nuestro navegador de preferencia y usamos la url get. Para ver que funcione corretamente nuetro spring boot consumiendo api de un servicio cognitivo
![imagen](imagen/paso_10.png)

