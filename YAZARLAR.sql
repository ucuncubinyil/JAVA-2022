create table yazarlar(
	id serial primary key,
	ad varchar(100),
	soyad varchar(100),
	unvani varchar(200)
);


insert  into yazarlar (ad, soyad, unvani)
values('Orhan', 'Pamuk', 'Nobel Ödüllü Yazar');


create table kitaplar(

	id serial primary key,
	kitap_adi varchar(100),
	yili date default current_date,
	fiyati smallint,
	yazar_id int
);


ALTER  TABLE kitaplar 
ADD CONSTRAINT fk_kitaplar
FOREIGN KEY (yazar_id)
REFERENCES yazarlar(id) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE kitaplar 
DROP CONSTRAINT fk_kitaplar;


ALTER  TABLE yazarlar 
ADD CONSTRAINT fk_yazarlar
FOREIGN KEY (yayin_evi_id)
REFERENCES yayin_evi(id) ON UPDATE CASCADE;



CREATE TABLE public.ogrenciler (
    id serial PRIMARY KEY,
    ad varchar NULL,
    fakulte_id int NULL,
    CONSTRAINT ogrenciler_fk 
        FOREIGN KEY (fakulte_id) 
        REFERENCES public.fakulte(id) ON DELETE CASCADE ON UPDATE CASCADE
);




select kitap_adi , yazar.ad as yazaradi  from kitaplar 
left join yazarlar as yazar on yazar.id  = kitaplar.yazar_id ;


insert into yazarlar (ad, soyad, unvani)
values	('Sabahattin', 'Ali', 'Eski Dönem Yazarı'),
		('Oğuz', 'Atay', 'Modern Yazar'),
		('Mustafa Kemal', 'Atatürk', 'T.C. İlk Yazarı'),
		('Mehmet Nuri', 'Öztürk', 'Mesleki Yazar'),
		('Onur', 'Yağcıoğlu', 'Roman Yazarı');
	
	
	
insert into kitaplar (kitap_adi, fiyati,yazar_id)
values ('Geometri', 400, 4);


select * from yazarlar;

select  * from kitaplar 
left join yazarlar on yazarlar.id  = kitaplar.yazar_id ;



create table yayin_evi (
	id serial primary key,
	ad varchar,
	durumu boolean default TRUE
);


alter table yazarlar add column yayin_evi_id int;


insert into yayin_evi (ad)
values('PG Akademi'),
		('Pusula'),
		('İletişim'),
		('Martı'),
		('Kodlab');


	
select  kitaplar.kitap_adi, yazarlar.ad as yazar_adi, yayin_evi.ad  as yayin_evi from kitaplar 
left join yazarlar on yazarlar.id  = kitaplar.yazar_id
left join yayin_evi on yayin_evi.id = yazarlar.yayin_evi_id
where kitaplar.id = 2;


-- select * from TABLO_ADI
-- left join ILIŞKİSİ_OLAN_TABLO_ADI on ILIŞKİSİ_OLAN_TABLO_ADI.İLİŞKİLİ_KOLON_ADI  = TABLO_ADI.İLİŞKİLİ_KOLON_ADİ

SELECT yazarlar.ad AS yazar_adi, yayin_evi.ad AS yayin_evi_adi FROM  yazarlar
LEFT JOIN yayin_evi  ON yayin_evi.id = yazarlar.yayin_evi_id ;


SELECT * FROM  yazarlar
RIGHT JOIN yayin_evi  ON yayin_evi.id = yazarlar.yayin_evi_id ;


SELECT DISTINCT(yayin_evi.ad) FROM  yazarlar
RIGHT JOIN yayin_evi  ON yayin_evi.id = yazarlar.yayin_evi_id ;


select  kitaplar.kitap_adi, yazarlar.ad as yazar_adi, yayin_evi.ad  as yayin_evi from kitaplar 
left join yazarlar on yazarlar.id  = kitaplar.yazar_id
left join yayin_evi on yayin_evi.id = yazarlar.yayin_evi_id
where kitap_adi LIKE '%o%';



CREATE TABLE customers(
   customer_id INT GENERATED ALWAYS AS IDENTITY,
   customer_name VARCHAR(255) NOT NULL,
   PRIMARY KEY(customer_id)
);



CREATE TABLE contacts(
   contact_id INT GENERATED ALWAYS AS IDENTITY,
   customer_id INT,
   contact_name VARCHAR(255) NOT NULL,
   phone VARCHAR(15),
   email VARCHAR(100),
   PRIMARY KEY(contact_id),
   CONSTRAINT fk_customer
      FOREIGN KEY(customer_id) 
      REFERENCES customers(customer_id)
);


SELECT * FROM customers 
LEFT JOIN contacts ON contacts.customer_id  = customers.customer_id ;


SELECT * FROM customers 
RIGHT JOIN contacts ON contacts.customer_id  = customers.customer_id ;


SELECT customers.customer_id, contacts.phone FROM customers 
INNER JOIN contacts ON contacts.customer_id  = customers.customer_id ;
 

SELECT * FROM yazarlar ORDER BY id asc ;


SELECT * FROM yazarlar ORDER BY id desc;


SELECT * FROM  yazarlar ORDER BY ad asc;



CREATE TABLE telefon(
    id serial PRIMARY KEY,
    seri_no varchar(30),
    model varchar(10),
    marka varchar(50)
);

CREATE TABLE rehber(
    id serial PRIMARY KEY,
    numara int  NOT NULL,
    telefon_id int NOT NULL ,
    CONSTRAINT fk_rehber
        FOREIGN KEY(telefon_id)
        REFERENCES public.telefon(id)
        ON UPDATE CASCADE 
        ON DELETE CASCADE 
);


SELECT * FROM public.ogrenciler 
INNER JOIN fakulte  ON fakulte.id =  public.ogrenciler .fakulte_id ;

DELETE FROM fakulte WHERE id = 2;


SELECT * FROM telefon;

INSERT INTO telefon(seri_no, model, marka)
VALUES ('AB1234', 'CX333', 'Oppo'),
        ('lkjasd342', '13 Pro', 'İphone');

SELECT * FROM rehber;

INSERT  INTO rehber(numara, telefon_id) values(505555, 2);


SELECT * FROM  rehber 
INNER JOIN telefon ON telefon.id =  rehber.telefon_id;


DELETE  FROM telefon WHERE  id = 1;
