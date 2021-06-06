CREATE TABLE "Bands" (
	"id" SERIAL PRIMARY KEY,
	"name" VARCHAR(30) NOT NULL,
	"ticket_price" FLOAT NOT NULL,
	"band_members" INT NOT NULL,
	"show_date" DATE NOT NULL
)
INSERT INTO "Bands" ("name","ticket_price","band_members","show_date")
VALUES 
	('Blur', 40.00, 4,TO_DATE('05/04/2021', 'DD/MM/YYYY')),
	('Beatles', 120.50, 4,TO_DATE('17/08/1960', 'DD/MM/YYYY')),
	('Foo Fighters', 89.99, 6,TO_DATE('23/07/2021', 'DD/MM/YYYY')),
	('Heart', 70.50, 6,TO_DATE('08/06/2022', 'DD/MM/YYYY')),
	('Wings', 99.99, 5,TO_DATE('09/12/1073', 'DD/MM/YYYY')),
	('Led Zeppelin', 40.00, 4,TO_DATE('05/03/1971', 'DD/MM/YYYY'));