
-- TABLOMUZU OLUŞTURUYORUZ
CREATE TABLE public.ogrenciler (
    id serial,
    ad varchar NOT NULL,
    soyad varchar NOT NULL,
    tc_no int NOT NULL
);

-- DDL VERİ TANIMLAMA DİLİ
-- CREATE(OLUŞTURMA) ALTER(GÜNCELLEME) DROP(SİLME)



-- TABLOMUZA KAYIT ATIYORUZ
INSERT INTO public.ogrenciler (ad,soyad,tc_no) 
VALUES('Ayşe', 'Gökçe', 2);

-- ÖĞRENCİLER TABLOSUNDAKİ TÜM KAYITLARI LİSTELİYORUZ
SELECT * FROM public.ogrenciler;

-- ÖĞRENCİLER TABLOSUNDA SADECE İSTEDİĞİMİZ KOLONLARIN DEĞERLERİNİ ALIYORUZ
SELECT id, ad, soyad, tc_no FROM public.ogrenciler ;


-- ÖĞRENCİLER TABLOSUNDA ID Sİ 2 OLAN KAYDI GETİRİR
SELECT * FROM public.ogrenciler  WHERE id = 2;


-- ÖĞRENCİLER TABLOSUNDA ID Sİ 3 VE ID Sİ 2 OLAN KAYDITLARI GETİRİR
SELECT * FROM public.ogrenciler WHERE id = 3 AND id = 2;


-- ÖĞRENCİLER TABLOSUNDA ID DEĞERİ 3 OLAN VEYA 2 OLAN KAYITLARI GETİR
SELECT * FROM public.ogrenciler WHERE id =  3 OR id = 2;



-- ÖĞRENCİLER TABLOSUNDA ID DEĞERİ 1 OLAN VEYA 2 OLAN KAYITLARI GETİR
SELECT * FROM public.ogrenciler WHERE id =  1 OR id = 2;

--ÖĞRENCİLER TABLOSUNDA ID DEĞERİ 2 OLAN KAYDIN ADINI Kerim olarak değiştir.
UPDATE ogrenciler SET ad = 'Kerim' WHERE id = 2;

-- ÖĞRENCİLER TABLOSUNDA SOYADI U İLE BİTEN KAYITLARI GETİRİR
SELECT  * FROM ogrenciler WHERE  soyad  LIKE '%U';,


-- ÖĞRENCİLER TABLOSUNDA SOYADI U BAŞLAYAN BİTEN KAYITLARI GETİRİR
SELECT  * FROM ogrenciler WHERE  soyad  LIKE 'U%';


-- ÖĞRENCİLER TABLOSUNDA SOYADINDA U GEÇEN BİTEN KAYITLARI GETİRİR
SELECT  * FROM public.ogrenciler WHERE  soyad  LIKE '%A%';


-- ÖĞRENCİLER TABLOSUNDA ID Sİ 2 
DELETE FROM ogrenciler WHERE id = 2;


-- ÖĞRENCİLER TABLOSUNA Varchar tipinde cinsiyeti isminde bir kolon oluşturur
ALTER TABLE ogrenciler ADD COLUMN cinsiyeti VARCHAR;


-- VAROLAN BİR KOLONU GÜNCELLER
ALTER  TABLE ogrenciler 
ALTER COLUMN cinsiyeti TYPE VARCHAR(10);

SELECT * FROM  ogrenciler ;

-- CİNSİYETİ BOŞ OLMAYAN KAYITLARI GETİR
SELECT * FROM  ogrenciler WHERE cinsiyeti IS NOT NULL ;

-- CİNSİYETİ BOŞ OLAN KAYITLARI GETİR
SELECT * FROM  ogrenciler WHERE cinsiyeti IS NULL ;

-- ÖĞRENCİLER TABLOSUNDA CİNSİYETİ ADINDAKI KOLONU GENDER OLARAK DEĞİŞTİR
ALTER  TABLE ogrenciler  RENAME COLUMN cinsiyeti TO gender;


SELECT  gender AS cinsiyet, ad  AS name, soyad AS surname FROM ogrenciler ;


CREATE TABLE distinct_demo (
    id serial NOT NULL PRIMARY KEY,
    bcolor VARCHAR,
    fcolor VARCHAR
);


INSERT INTO distinct_demo (bcolor, fcolor)
VALUES
    ('red', 'red'),
    ('red', 'red'),
    ('red', NULL),
    (NULL, 'red'),
    ('red', 'green'),
    ('red', 'blue'),
    ('green', 'red'),
    ('green', 'blue'),
    ('green', 'green'),
    ('blue', 'red'),
    ('blue', 'green'),
    ('blue', 'blue');


SELECT
    id,
    bcolor,
    fcolor
FROM
    distinct_demo ;



SELECT DISTINCT ON(bcolor)  bcolor, fcolor FROM distinct_demo;


SELECT  * FROM distinct_demo WHERE  ID IN (1,2,3,4,5);

SELECT  * FROM  distinct_demo WHERE  ID BETWEEN 1 AND 5;


SELECT  SUM(id) AS TOTAL FROM distinct_demo;



CREATE TABLE STOK_DURUMU(
    urun_id INT PRIMARY KEY,
    durumu BOOLEAN DEFAULT 't' NOT NULL
);


INSERT INTO stok_durumu (urun_id, durumu)
VALUES
    (100, TRUE),
    (200, FALSE),
    (300, 't'),
    (400, '1'),
    (500, 'y'),
    (600, 'yes'),
    (700, 'no'),
    (800, '0');


SELECT * FROM stok_durumu;

CREATE TABLE kitaplar(
    kitap_id SERIAL PRIMARY KEY,
    baslik VARCHAR(255) NOT NULL,
    sayfa_sayisi SMALLINT NOT NULL CHECK(sayfa_sayisi > 0)
);


CREATE TABLE sehirler(
    sehir_id SERIAL PRIMARY KEY,
    sehir_adi VARCHAR(255),
    nufus INT NOT NULL CHECK( nufus >= 0)
);


CREATE TABLE dokumanlar(
dokuman_id SERIAL PRIMARY KEY,
baslik VARCHAR(255), 
eklenme_tarihi DATE NOT NULL DEFAULT CURRENT_DATE
);


SELECT NOW()::date;

SELECT current_date ;

SELECT  TO_CHAR(NOW() :: DATE, 'dd.mm.yyyy');

SELECT age('2015-01-01',eklenme_tarihi) FROM dokumanlar ;

