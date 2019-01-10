INSERT INTO product_model (id_burger, name_burger, id_ingredient, ingredient_quantity) VALUES ('1','Classic', '1', '1');
INSERT INTO product_model (id_burger, name_burger, id_ingredient, ingredient_quantity) VALUES ('1','Classic', '2', '200');
INSERT INTO product_model (id_burger, name_burger, id_ingredient, ingredient_quantity) VALUES ('2','BBQ', '1', '1');
INSERT INTO product_model (id_burger, name_burger, id_ingredient, ingredient_quantity) VALUES ('2','BBQ', '3', '2');
INSERT INTO product_model (id_burger, name_burger, id_ingredient, ingredient_quantity) VALUES ('3','Cheesee', '2', '400');
INSERT INTO product_model (id_burger, name_burger, id_ingredient, ingredient_quantity) VALUES ('3','Cheesee', '4', '2');

INSERT INTO ingredient_model (id_ingredient, name_ingredient, id_supplier, stock_ingredient, best_of_ingredient) VALUES ('1', 'roll', '1', '10', '2019-03-01');
INSERT INTO ingredient_model (id_ingredient, name_ingredient, id_supplier, stock_ingredient, best_of_ingredient) VALUES ('2', 'meat', '2', '3000', '2019-01-20');
INSERT INTO ingredient_model (id_ingredient, name_ingredient, id_supplier, stock_ingredient, best_of_ingredient) VALUES ('3', 'bacon', '2', '30', '2019-01-15');
INSERT INTO ingredient_model (id_ingredient, name_ingredient, id_supplier, stock_ingredient, best_of_ingredient) VALUES ('3', 'bacon', '2', '10', '2019-01-20');
INSERT INTO ingredient_model (id_ingredient, name_ingredient, id_supplier, stock_ingredient, best_of_ingredient) VALUES ('4', 'cheese', '3', '20', '2019-02-15');

INSERT INTO supplier_model (name_supplier, address_supplier) VALUES ('Pieczywo', 'Poznan');
INSERT INTO supplier_model (name_supplier, address_supplier) VALUES ('Mieso', 'Warszawa');
INSERT INTO supplier_model (name_supplier, address_supplier) VALUES ('Ser', 'Wroclaw');