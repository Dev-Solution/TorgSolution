CREATE TABLE good(
 id int PRIMARY KEY,
 name VARCHAR (255)  NOT NULL,
 barcode VARCHAR (20) NOT NULL,
 article VARCHAR (50) NULL,
 purchase_price decimal(12, 2) NOT NULL,
 price decimal(12,2)NOT NULL,
 good_type_id int NULL,
 FOREIGN KEY (good_type_id) REFERENCES good_type (id)
);

CREATE TABLE good_type(
 id int PRIMARY KEY,
 name VARCHAR (255)  NOT NULL

);

CREATE TABLE shop(
 id int PRIMARY KEY,
 name VARCHAR (255)  NOT NULL
);

CREATE TABLE warehouse(
 id int PRIMARY KEY,
 quantity decimal(12,6)NOT NULL,
 shop_id int not Null,
 good_id int not Null,
 FOREIGN KEY (good_id) REFERENCES good (id),
 FOREIGN KEY (shop_id) REFERENCES shop (id)
);

CREATE TABLE income_invoice(
 id int PRIMARY KEY,
 date timestamp,
 shop_id int not Null,
 FOREIGN KEY (shop_id) REFERENCES shop (id)
);

CREATE TABLE income_composition(
 id int PRIMARY KEY,
 income_invoice_id int not Null,
 good_id int not Null,
 FOREIGN KEY (income_invoice_id) REFERENCES income_invoice (id),
 FOREIGN KEY (good_id) REFERENCES good (id)
);
