INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treener');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treenija');

INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Mari', 'Murakas', '1986-11-09', 'F', 'mari.murakas@gmail.com', true);
INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Kadri', 'Karu', '1956-11-09', 'F', 'kadri.karu@gmail.com', true);

INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 1, 1, 'treener', '123');
INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 2, 2, 'treenija', '123');

INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'silmaringid', 'kirjeldus1', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'sõrmevenitus', 'kirjeldus2', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'ajugümnastika', 'kirjeldus3', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'juuksetõsted', 'kirjeldus4', '''''');

INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Kõht');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Selg');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Jalad');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Käed');