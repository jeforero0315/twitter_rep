# RepositorioAYGOJen
1. Hacer la creación de la imagen de docker.
Primero se debe hacer la generación de la imagen docker del proyecto, se realiza de la siguiente manera:
docker build --tag apitwitter
2. Ir hacia Docker Desktop para visualizar la imagen que se creó
3. 
<img width="753" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/671f7ff3-d6ad-4eab-abe3-18c3ce1c8c06">

4. por medio del comando docker images, confirmamos la creación de la imagen, en este caso "apitwitter"

<img width="476" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/b76c0f70-f1ee-4baf-b571-b01dca96289c">

4. Creación de una instancia para el contenedor de la imagen "apitwitter"
-> Para este caso hacia el puerto 4567 

<img width="955" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/1f51cfff-e2e0-47ad-bd3e-f50cd2f21cf5">

5. Ahora vamos a Docker Desktop para hacer la confirmación de que efectivamente se creó la instancia del contenedor:

![image](https://github.com/jeforero0315/RepositorioAYGOJen/assets/149447477/987aec2d-61dd-4243-8966-cf19765a7697)

--------------------------------------SEGUNDA PARTE ----------------AWS---------
se debe subir la imagen a dockerHub y hacer el relacionamiento con los servicios de virtualizacion de AWS. 
Imagen del proyecto en dockerHub: https://hub.docker.com/r/jeforero0315/sparkprojectjeniffer

-><img width="685" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/a3e41e78-cfe2-4af8-8438-e1642ea84fcd">
1. Teniendo en este punto el repositorio de dockerHub, se accede a AWS y se hace la creación de la maquina virtual junto con la llave de acceso
2. Se hizo la conexión hacia la maquina virtual y se instaló docker, teniendo lo anterior se creó una instancia del contenedor de la imagen subida al repositorio en dockerHub.
3. Máquina virtual creada apartir del servicio EC2 de AWS
<img width="891" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/bae9a37e-9a8c-47ec-8bde-d6cd32a5f92a">
4. Conexión a máquina virtual, se ejecuta el comando docker ps, el cual mostrará la instancia del contenedor en ejecución
<img width="949" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/726ee18f-0b4a-45ac-995b-99c2f182206b">
5. ejecución del comando sudo docker ps -a para ver las instancias creadas, se está ejecutando por medio de la instancia con el puerto 4567
<img width="486" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/55537b55-b6fe-416d-ba22-a0e0535ddf84">


---------------------------LAMBDA------------------------
FUNCIÓN CREADA, NOMBRE:TwitterGet
<img width="630" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/f2cf74a1-679e-4968-a629-27e1cbfd43f6">
FUNCTION OVERVIEW
<img width="709" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/74878363-e81a-4e89-b5bb-2d7a6afb1b87">
Realización de test en lamda
<img width="832" alt="image" src="https://github.com/jeforero0315/twitter_rep/assets/149447477/f184faa8-804b-48d4-a411-397066f1ab26">

