INSERT INTO tb_roles(id, name) VALUES (1, 'admin') ON CONFLICT DO NOTHING;
INSERT INTO tb_roles(id, name) VALUES (2, 'basic') ON CONFLICT DO NOTHING;
