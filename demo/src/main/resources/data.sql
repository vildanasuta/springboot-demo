DROP TABLE IF EXISTS translation;

CREATE TABLE translation(
id INT AUTO_INCREMENT PRIMARY KEY,
originalMessage NVARCHAR(50) NOT NULL,
languageName NVARCHAR(50) NOT NULL

);

INSERT INTO translation (id, originalMessage, languageName) VALUES (1, 'Hello World', 'English');
INSERT INTO translation (id, originalMessage, languageName) VALUES (2, 'Hallo Welt', 'German');
INSERT INTO translation (id, originalMessage, languageName) VALUES (3, 'Pozdrav svijete', 'Bosnian');
INSERT INTO translation (id, originalMessage, languageName) VALUES (4, 'Hallo Wereld', 'Dutch');
INSERT INTO translation (id, originalMessage, languageName) VALUES (5, 'Përshendetje Botë', 'Albanian');
INSERT INTO translation (id, originalMessage, languageName) VALUES (6, 'Ciao mondo', 'Italian');
INSERT INTO translation (id, originalMessage, languageName) VALUES (7, 'Olá Mundo', 'Portuguese');
INSERT INTO translation (id, originalMessage, languageName) VALUES (8, '¡Hola Mundo', 'Spanish');
INSERT INTO translation (id, originalMessage, languageName) VALUES (9, 'Hej världen', 'Swedish');
INSERT INTO translation (id, originalMessage, languageName) VALUES (10, 'Selam Dünya', 'Turkish');
