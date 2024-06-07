# AddressBook Wiki

## Descripción
Este proyecto está destinado a crear una libreta de direcciones, en donde se despliega un menú interactivo para poder elegir entre varias opciones disponibles, el usuario deberá indicarle las acciones al programa para poder darle seguimiento a las funciones.

## Opción a)
El usuario indica que se desea cargar una serie de textos separados por un salto de línea, en donde cada uno contendrá información necesaria para llenar los registros. Es de suma importancia recordar que estos registros llevan un orden específico, siendo como primer dato a ingresar el nombre de la persona, seguido de su apellido, posteriormente debe encontrarse el dato correspondiente a la calle de residencia, seguido de la ciudad, el estado, el número postal, el número telefónico y por último una dirección de correo electrónico.

## Opción b)
El usuario indica que se desea agregar manualmente un nuevo registro en el AddressBook, en donde se realizará una serie de entradas dependiendo de lo solicitado, manteniendo el mismo orden ya antes visto en la opción a) siendo la primera entrada de dato el nombre de la persona, hasta llegar finalmente al correo electrónico. De igual forma, el programa siempre informará en todo momento cuál es el dato que se requiere al usuario.

Al terminar las entradas, el registro se encontrará disponible para su despliegue en las opciones posteriores.

## Opción c)
El usuario indica que se desea borrar una dirección de la libreta. El programa pedirá al usuario ingresar el apellido de la persona que se desea eliminar el registro, esto de modo más accesible para poder encontrar el registro correcto. Posteriormente, el programa despliega todos los resultados concordantes con el apellido ingresado, siendo una numeración en orden alfabético de la A-Z. Cada dirección contará con un número asignado a esta misma iniciando por el número 1-Límite, en donde el usuario deberá digitar el número identificador de la entrada a eliminar. En el momento en el que el usuario realiza la acción, la dirección es eliminada permanentemente del AddressBook.

## Opción d)
El usuario indica que se desea buscar una dirección en concreto. Para realizar esto, el usuario deberá ingresar el apellido de la persona en cuestión, y al igual que en la opción anterior, se desplegará la lista de todos los resultados concordantes con el apellido ingresado anteriormente. En este caso, no se puede mostrar solo un resultado en caso de haber más de una persona con el mismo apellido, ya que al buscarlo por este mismo, el programa arrojará todos los resultados concordantes. El usuario podrá encontrar todas las personas con ese apellido, así como sus datos de dirección en la libreta en orden alfabético.

## Opción e)
El usuario indica que se desea mostrar un listado de todas las direcciones del AddressBook en un orden alfabético. Es importante recordar que se recomienda haber ingresado ya sea por una carga de archivo o manualmente, al menos un registro de dirección, de lo contrario no se mostrarán direcciones y el AddressBook estará vacío.

## Opción f)
El usuario indica que se desea finalizar el proceso de ejecución del programa. Al momento de ser digitada la entrada con la letra f, el programa se detendrá exitosamente. Es importante recordar que al momento de realizar esta acción, el AddressBook no guarda permanentemente ninguna dirección, siendo necesario volver a cargar o ingresar manualmente direcciones en futuras ejecuciones del programa.
