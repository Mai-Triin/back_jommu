INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treener');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treenija');

INSERT INTO public."user" (id, username, password, role_id) VALUES (DEFAULT, 'treener', '123', 1);
INSERT INTO public."user" (id, username, password, role_id) VALUES (DEFAULT, 'treenija', '123', 2);
