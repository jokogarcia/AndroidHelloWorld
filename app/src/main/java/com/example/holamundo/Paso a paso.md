## Commit 1. Primer
- Crear un proyecto Android nuevo "HolaMundo" a base de Empty Activity
- Hacer tour por la estructura del proyecto. Explicar Manifest.xml, carpeta java, carpetas de test,
carpeta res.  **Averiguar diferencias MIPMAP y drawable**
- Explicar emulador y dispositivo real. Guiar alumnos a activar modo desarrollador en dipositivos
reales y a crear un emulador en AVD Manager.
  - Compilar y correr app en emulador. Los alumnos lo haran en emulador o dispositivo real.
## Commit 2. Títulos.
    - Llamar atención al título definido en el manifesto y el string, y al nombre de la app en el 
      launcher. 
    - Hacer que los alumnos cambien el tìtulo de la app.
## Commit 3. Boton
- Agregar un botón en el main_layout, debajo del label que está por defecto.
- Explicar ids, views, findViewById
- setear el parametro onClick del boton al metodo onClick de la actividad
- Implementar onClickListener en mainActivity y agregar comportamiento de boton ahi.
## Commit 4. Boton color
- Agregar un segundo boton que tambien use el onClick de la actividad
- Usar el id de los botones para identificar a cual se refiere en el codigo.
- El comportamiento del boton nuevo es cambiar el color de texto
- Quitar strings hardcodeadas y utilizar strings.xml
## Comit 5. When
   Utilizar When en vez de bloques if para distinguir ids de botones
## Commit 6. OnSaveInstanceState
Implementar onSaveInstanceState y onRestoreInstanceState para preservar valores cambiados por el usuario