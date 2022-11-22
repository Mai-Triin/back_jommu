INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treener');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treenitav');

INSERT INTO public."user" (id, username, password, role_id) VALUES (DEFAULT, 'treener123', '123', 1);
INSERT INTO public."user" (id, username, password, role_id) VALUES (DEFAULT, 'treenitav123', '456', 2);
