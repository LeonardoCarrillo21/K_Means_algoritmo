# K_Means_algoritmo

Algoritmo de clasificación K_Means

## Contenido
- [Descripcion](#descripcion)
- [Carcateristicas](#caracteristicas)
- [Video Muestra](#video)
- [Requisitos](#requisitos)
- [Instalación](#instalacion)
- [Uso](#uso)

## Descrpcion <a name="descripcion"></a>
El objetivo del algoritmo K-means es agrupar los datos en K grupos diferentes, donde K es un número predefinido por el usuario. Cada grupo se representa mediante su centroide, que es el punto medio o promedio de todos los puntos pertenecientes a ese grupo. El algoritmo se basa en la minimización de la suma de las distancias al cuadrado entre cada punto y el centroide de su grupo correspondiente.

## Video Muestra<a name="video"></a>
https://github.com/LeonardoCarrillo21/K_Means_algoritmo/assets/83992677/18cfd0f4-1871-42aa-99dc-97d99a9620e4
<hr>

## Caracteristicas <a name="caracteristicas"></a>

### Interfaz
  - El numero de individuos puede superar los 10 000 000 (depende el equipo de computo), este esta definido en input "items".
  - el numero de clases maximo esta definido en input "k".
  - boton remake para reiniciar el programa y la interfaz.
  - botón Go para recalcular los centroides en cada iteración.

### Algoritmo K Means:
  1. Seleccionar el valor de K, que indica el número de grupos en los que se desea dividir los datos.
  2. Inicializar aleatoriamente los centroides de los K grupos (preudoaleatorio en este caso, ya que el usuario decide donde colocar los centroides inicialmente).
  3. Asignar cada punto de datos al grupo cuyo centroide esté más cerca.
  4. Recalcular los centroides de cada grupo como el promedio de los puntos asignados a ese grupo.
  5. Repetir los pasos 3 y 4 hasta que los centroides ya no cambien o se alcance un criterio de parada.

## Requisitos <a name="requisitos"></a>
- un equipo de computo que soporte Apache NetBeans

## Instalacion <a name="instalacion"></a>
- Apache NetBeans

## Uso <a name="uso"></a>
1. Se seleccionan los datos iniciales: "items" (elementos), "k" (clases).
2. clic repetidas veces en Go para mostrar la forma en la que se calculan los centroides y se reubican los puntos




