TRUNCATE TABLE invoice cascade;
TRUNCATE TABLE customer cascade;


INSERT INTO public.invoice (id, created_at, last_updated, doc_number, place_of_issue, sell_date) VALUES (1, '2024-09-09 06:49:04.000000', '2024-09-09 06:49:07.000000', '123', 'Warsaw', '2024-09-09');

INSERT INTO customer (created_at, last_updated, id, vat_id) VALUES ('2024-09-19 17:19:37.000000', null, '267a8a45-f6ea-46e7-9c21-2166936c9c2b', '1111111111');
INSERT INTO customer_data (created_at, last_updated, version, customer_id, address, name) VALUES ('2024-09-19 17:20:04.000000', '2024-09-19 17:19:56.000000', 1, '267a8a45-f6ea-46e7-9c21-2166936c9c2b', 'Testowa 1, 00-001 Warszawa', 'Test sp. z o.o.');
