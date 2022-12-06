INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treener');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treenija');

INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Mari', 'Murakas', '1986-11-09', 'F', 'mari.murakas@gmail.com', true);
INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Kadri', 'Karu', '1956-11-09', 'F', 'kadri.karu@gmail.com', true);

INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 1, 1, 'treener', '123');
INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 2, 2, 'treenija', '123');

INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'silmaringid', 'kirjeldus1', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'sõrmesirutus', 'kirjeldus2', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'ajuraputus', 'kirjeldus3', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'juuksetõsted', 'kirjeldus4', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'varbavenitus', 'kirjeldus4', '''''');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'nabakummardus', 'kirjeldus4', '''''');

INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Pea');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Keha');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Jalad');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Käed');

INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 2, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 3, 1);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 4, 1);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 5, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 6, 2);

INSERT INTO public.workout_plan (id, name, user_id, status) VALUES (DEFAULT, 'Peagümnastika', 2, 'A');

INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 1, 1, 12, 3, 0, 'A');
INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 1, 3, 3, 2, 5, 'A');



