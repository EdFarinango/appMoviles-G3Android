# APP-MOVILES
#### Integrantes:

- Kevin Pinanjota
- Eduardo Farinango
- Mateo Cueva


### Implementar los ejercicios del 3 al 46 de acuerdo a las instrucciones brindadas. 

GRUPO 3
Implementar los ejercicos 5,10,15,20,25,30,35,40,45

- Ejercicio 25

Disponer un botón con la etiqueta: "gato", luego cuando se presione reproducir el archivo de audio respectivo. El archivo de sonido almacenarlo en la tarjeta SD.
Luego de crear el proyecto (Proyecto027) debemos ejecutar la aplicación para poder acceder a la tarjeta SD que crea el emulador Android.
Una vez que se este ejecutando la aplicación (no importa que todavía no hemos implementado su funcionalidad) procedemos a abrir la ventana "Device File Explorer". Seleccionamos del menú de opciones de View->Tool Windows->Device File Explorer.

### Desarrollo:

- Es necesario cargar el archivo mp3 en la carpeta que aparece en la imagen siguiente. Para hacerlo, debemos seleccionar dicha carpeta con el cursor y, luego, pulsar el botón derecho del mouse y escoger la opción "Subir" o "Cargar", dar permisos en la carpeta sdcard para poder acceder.



<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219978915-5fdd8460-bbf2-41f4-a652-4b2b0019946d.png" width="400"/></p>

<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219979273-ebd85aef-c6f0-4309-a0a9-6886e0d3a38c.png" width="400"/></p>

- Vamos a crear la interfaz de nuestra aplicación, que consistirá en un único botón. Cuando se haga clic en este botón, se llamará al método "ejecutar".


<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219979426-bdba82bb-f42f-4509-847b-46d475fea967.png" width="400"/></p>


Codgo Main se implementa el metodo Onclic "ejecutar" 

<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219979480-32b98755-a64d-4e85-bf5c-e0ad89a9059d.png" width="600"/></p>


- Ejercicio 40

Implementar el juego del Buscaminas. Crear una grilla de 8*8 celdas.

Creamos un proyecto llamado: BuscaMinas
Borramos el TextView que agrega automáticamente el Android Studio y disponemos un Button y un LinearLayout:
Al botón inicializamos la propiedad onClick con el valor "reiniciar" y al LinearLayout le asignamos el ID como "layout1".


<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219981929-4d545526-4818-422f-9b44-f526a7ed9e5d.png" width="600"/></p>

- Creamos una clase MainActivity y Casilla 

<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219982064-8451217e-7cf5-45da-8742-5cfc59a67f4c.png" width="600"/></p>

- Resultado

<p align="center"><img src ="https://user-images.githubusercontent.com/74762981/219982164-d9c2daea-7c2f-465f-bb31-05a1ce5d94f9.png" width="400"/></p>



