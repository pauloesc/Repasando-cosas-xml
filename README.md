Este proyecto tiene por objetivo extender mis conocimientos sobre las configuraciones posibles en web.xml.
Ademas tiene por objetivo repasar el comportamiento por defecto.

Alunas paginas con documentacion:

https://docs.oracle.com/cd/E24329_01/web.1211/e21049/web_xml.htm#i1043406

https://cloud.google.com/appengine/docs/flexible/java/configuring-the-web-xml-deployment-descriptor?hl=es-419

https://www.chankok.com/web-xml-namespace-declaration-and-schema-location/

Recordar lo siguiente de los filtros:
Después de que se invoca el recurso original, el control se devuelve al filtro en la parte inferior de la lista en la cadena. Este filtro puede luego examinar y modificar las cabeceras y datos de la respuesta, bloquear la solicitud, lanzar una excepción o invocar al siguiente filtro hacia arriba desde la parte inferior de la cadena. Este proceso continúa en orden inverso a lo largo de la cadena de filtros. (Si no queda claro ver lo que se imprime en consola)
