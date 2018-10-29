
INSERT INTO categorias (id_cat, nombre_cat, descripcion_cat) VALUES (111111, 'cultura', 'viaje por cultura');
INSERT INTO categorias (id_cat, nombre_cat, descripcion_cat) VALUES (222222, 'deporte', 'viaje por deporte');
INSERT INTO categorias (id_cat, nombre_cat, descripcion_cat) VALUES (333333, 'aventura', 'viaje por aventura');


INSERT INTO lugares (id_lugar, descripcion_lugar, nombre_lugar, ubicacion_lugar ) VALUES (12345,'ubicado en cochabamba','coronilla','cochabamba');
INSERT INTO lugares (id_lugar, descripcion_lugar, nombre_lugar, ubicacion_lugar ) VALUES (23456,'ubicado en oruro','uyuni','oruro');
INSERT INTO lugares (id_lugar, descripcion_lugar, nombre_lugar, ubicacion_lugar ) VALUES (34567,'ubicado en potosi','torotoro','potosi');

INSERT INTO cronogramas (id_cro, descripcion_cro, fecha_cro, hora_cro, nombre_cro ) VALUES (100000, 'desayunar en la baquita', '01/8/2018','01:00:00','desayuno');
INSERT INTO cronogramas (id_cro, descripcion_cro, fecha_cro, hora_cro, nombre_cro ) VALUES (200000, 'almorzar en la baquita', '02/8/2018','02:00:00','almuerzo');
INSERT INTO cronogramas (id_cro, descripcion_cro, fecha_cro, hora_cro, nombre_cro ) VALUES (300000, 'cenar en la baquita', '03/8/2018','03:00:00','cena');


INSERT INTO paquetes (id_paquete,nombre_paquete, descripcion_paquete, costo_paquete, estado_paquete, cupo_min_paquete,id_cat, id_lugar, id_cro ) VALUES (1,'paquete1','descripcion paquete1',156.51,'disponible',100,111111,12345,100000);
INSERT INTO paquetes (id_paquete,nombre_paquete, descripcion_paquete, costo_paquete, estado_paquete, cupo_min_paquete,id_cat, id_lugar, id_cro ) VALUES (2,'paquete1','descripcion paquete1',157.52,'disponible',200,222222,23456,200000);
INSERT INTO paquetes (id_paquete,nombre_paquete, descripcion_paquete, costo_paquete, estado_paquete, cupo_min_paquete,id_cat, id_lugar, id_cro ) VALUES (3,'paquete1','descripcion paquete1',158.53,'disponible',300,333333,34567,300000);
