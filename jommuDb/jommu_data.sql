INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treener');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treenija');

INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Mari', 'Murakas', '1986-11-09', 'F', 'mari.murakas@gmail.com', true);
INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Kadri', 'Karu', '1956-11-09', 'F', 'kadri.karu@gmail.com', true);

INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 1, 1, 'treener', '123');
INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 2, 2, 'treenija', '123');
