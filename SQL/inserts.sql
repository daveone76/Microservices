select * from product;


select * from category;


select * from invoce_items;

select * from invoices;

INSERT INTO category (id, name) VALUES (1, 'shoes');
INSERT INTO category (id, name) VALUES (2, 'books');
INSERT INTO category (id, name) VALUES (3, 'electronics');

INSERT INTO product (id, name, description, stock,price,status, create_at,category_id)
VALUES (1, 'adidas Cloudfoam Ultimate','Walk in the air in the black / black CLOUDFOAM ULTIMATE running shoe from ADIDAS',5,178.89,'CREATED','2018-09-05',1);

INSERT INTO product (id, name, description, stock,price,status, create_at,category_id)
VALUES (2, 'under armour Men ''s Micro G Assert – 7','under armour Men ''Lightweight mesh upper delivers complete breathability . Durable leather overlays for stability ',4,12.5,'CREATED','2018-09-05',1);


INSERT INTO product (id, name, description, stock,price,status, create_at,category_id)
VALUES (3, 'Spring Boot in Action','under armour Men '' Craig Walls is a software developer at Pivotal and is the author of Spring in Action',12,40.06,'CREATED','2018-09-05',2);



INSERT INTO region (id, name) VALUES (1, 'Sudamérica');
INSERT INTO region (id, name) VALUES (2, 'Centroamérica');
INSERT INTO region (id, name) VALUES (3, 'Norteamérica');
INSERT INTO region (id, name) VALUES (4, 'Europa');
INSERT INTO region (id, name) VALUES (5, 'Asia');
INSERT INTO region (id, name) VALUES (6, 'Africa');
INSERT INTO region (id, name) VALUES (7, 'Oceanía');
INSERT INTO region (id, name) VALUES (8, 'Antártida');

INSERT INTO customer (id,number_id,first_name,last_name , email, photo_url, region_id, state) VALUES(1,'32404580', 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com','',1,'CREATED');

INSERT INTO invoices (id, number_invoice, description, customer_id, create_at, state) VALUES(1, '0001', 'invoice office items', 1, NOW(),'CREATED');

INSERT INTO invoce_items (id, invoice_id, product_id, quantity, price ) VALUES(1,1, 1 , 1, 178.89);
INSERT INTO invoce_items (id, invoice_id, product_id, quantity, price)  VALUES(2,1, 2 , 2, 12.5);
INSERT INTO invoce_items (id, invoice_id, product_id, quantity, price)  VALUES(3, 1, 3 , 1, 40.06);