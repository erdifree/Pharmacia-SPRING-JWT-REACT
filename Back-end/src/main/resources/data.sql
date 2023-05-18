




INSERT into REGISTER_USER (address,city,country,dob,lastname,name,zip_code,user_id)
VALUE("Carlo Poerio","Nardò","Italy",'1987-02-18',"Dosti","Erdison",78048,1),("Belvedere","Spinazzola","Italy",'1988-09-14',"Colaianni","Carla",70121,2);




INSERT into product (code_product,description,product_name,price,quantity,type_product)
VALUE("#5566","Antinfiammatorio","OKI",9.88,120,"bustine"),("#5566","Antinfiammatorio","Brufen",6.88,100,"Capsule"),("#5466","Antinfiammatorio","Moment",7.00,100,"Capsule");

INSERT into pharmacy (address,city,name,vat_code,user_id)
VALUE("Corso Cavur","Bari","D'Alessandro",0610335598,1),("Via Parano","Bari","Farmacia Della Stazione",0780335598,2);



INSERT into orders(aquired,is_payed,total_price,pharmacy_id)
VALUE('2023-02-02',0,221,1),('2023-02-03',0,221,1),('2023-05-02',0,221,1);



INSERT into pharmacia_has_product (quantiy_available,pharmacy_id,product_id)
VALUE(15,1,1);
