# APP-MOVILES
#### Integrantes:

- Kevin Pinanjota
- Eduardo Farinango
- Mateo Cueva


### Implementar los ejercicios del 3 al 46 de acuerdo a las instrucciones brindadas. 

GRUPO 3
Implementar los ejercicos 5,10,15,20,25,30,35,40,45

- Ejercicio 5

Realizar la carga de dos números en controles de tipo EditText ("Number"). Mostrar en las propiedades "hint" de cada componente un mensaje que solicite la carga de los valores. Disponer dos controles de tipo CheckBox para seleccionar si queremos sumar y/o restar dichos valores. Finalmente mediante un control de tipo Button efectuamos la operación respectiva. Mostramos el o los resultados en un TextView.

### Desarrollo:

- En el archivo activity_main.xml realizamos la parte visual de la aplicacion, ademas de asginar las propiedas respectivas a cada uno de los elementos de la interfaz grafica, entre ella las propiedas 'text' para mostrar un texto e 'id' para referenciar al boton CheckBox.

<p align="center"><img src ="https://user-images.githubusercontent.com/74993888/220184979-805b0beb-d713-4099-a94a-8bd2039667c6.png" width="400"/></p>

- Se debe realizar el mismo paso antes descrito para los demas elementos, cada elemento debe quedar como se muestra en la imágen.

<p align="center"><img src ="https://user-images.githubusercontent.com/74993888/220185499-f117f74d-ac59-48c9-b251-c28d00195d3a.png" width="400"/></p>

- En el archivo activity_main.xml realizamos la parte visual de la aplicació, ademas de asginar las propiedas respectivas a cada uno de los elementos de la interfaz grafica, entre ella las propiedas 'text' para mostrar un texto e 'id' para referenciar al boton CheckBox.

<p align="center"><img src ="https://user-images.githubusercontent.com/74993888/220184979-805b0beb-d713-4099-a94a-8bd2039667c6.png" width="400"/></p>

- Se debe realizar el mismo paso antes descrito para los demas elementos, cada elemento debe quedar como se muestra en la imágen.

<p align="center"><img src ="https://user-images.githubusercontent.com/74993888/220185499-f117f74d-ac59-48c9-b251-c28d00195d3a.png" width="400"/></p>

- No olvidemos inicializar la propiedad onClick del objeto button con el valor "operar" (es el nombre del método a ejecutarse cuando se presione el botón y lo implementa la clase que hacemos)

- El siguiente paso es dirigirnos hacia el archivo 'MainActivity.java', y desarrollar la funcionalidad de la aplicacion, para esta apliación son las operaciones.

```
package com.example.a35dibujartexto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout1 =  findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
        getSupportActionBar().hide();
    }


    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(0, 0, 255);
            Paint pincel1 = new Paint();
            pincel1.setARGB(255, 255, 0, 0);
            pincel1.setTextSize(30);
            pincel1.setTypeface(Typeface.SERIF);
            canvas.drawText("Hola Mundo (SERIF)", 0, 70, pincel1);
            pincel1.setTypeface(Typeface.SANS_SERIF);
            canvas.drawText("Hola Mundo (SANS SERIF)", 0, 100, pincel1);
            pincel1.setTypeface(Typeface.MONOSPACE);
            canvas.drawText("Hola Mundo (MONOSPACE)", 0, 140, pincel1);
            Typeface tf = Typeface.create(Typeface.SERIF, Typeface.ITALIC);
            pincel1.setTypeface(tf);
            canvas.drawText("Hola Mundo (SERIF ITALIC)", 0, 180, pincel1);
            tf = Typeface.create(Typeface.SERIF, Typeface.ITALIC | Typeface.BOLD);
            pincel1.setTypeface(tf);
            canvas.drawText("Hola Mundo (SERIF ITALIC BOLD)", 0, 220, pincel1);
        }
    }
}
```

- El resultado y funcionalidad es el siguiente, se ejecuta la aplicación desde un emulador o también se lo puede realizar desde un celular descargando su APK. Una vez iniciada la aplicación se observa que realiza correctamente las operaciones y que los botones CheckBox estan teniendo su respectiva interaccion.

<p align="center"><img src ="https://user-images.githubusercontent.com/74993888/220187036-5f87af7a-93cc-4025-ae06-fef6aaeb9561.png" width="400"/></p>

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

- Ejercicio 30
Dibujar: Graficar un píxel.
Creación de un proyecto: Proyecto033.
luego borramos el TextView para proceder a definir un id para el ConstraintLayout (le asignamos como id el valor layout1).
![image](https://user-images.githubusercontent.com/68386574/220636422-89299c36-3e9c-48e3-98cb-eb756d38cba7.png)
Ahora procedemos a dirigirnos al MainActivity.java debemos crear el metodo onDraw en este metodo obtenemos el ancho y el alto mediante los metodos getWidth() y getHeight() que nos provee la clase Canvas.
Seguidamente creamos un objeto de la clase Paint. Llamamos al método setARGB para definir el color del pincel

![image](https://user-images.githubusercontent.com/68386574/220665561-49ac995c-c7f8-4300-bed0-4419cda88de0.png)

Por último en el método onCreate del Activity obtenemos la referencia del ConstraintLayout que tiene el Activity. Creamos un objeto de la clase Lienzo.
y agregamos el objeto fondo al ConstraintLayout llamando al método addView

![image](https://user-images.githubusercontent.com/68386574/220667000-26c9e3cf-9637-4e25-9337-0f22692b8f6c.png)

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



