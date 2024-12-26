INSERT INTO producer (name, email, phone, address, images, tag, list_products, password, location)
VALUES
    ('João Silva', 'joao.silva@example.com', '912345678', 'Rua das Flores, 123', 'joao.jpg', 'frutas',
     '{"products": [{"nome": "maçã", "quantidade": 10, "imagem": "maca.jpg", "preco": 2.5}, {"nome": "banana", "quantidade": 15, "imagem": "banana.jpg", "preco": 1.8}]}', 'senha123', 'Lisboa'),
    ('Maria Souza', 'maria.souza@example.com', '913456789', 'Avenida Central, 456', 'maria.jpg', 'hortaliças',
     '{"products": [{"nome": "alface", "quantidade": 20, "imagem": "alface.jpg", "preco": 1.2}, {"nome": "cenoura", "quantidade": 25, "imagem": "cenoura.jpg", "preco": 0.9}]}', 'senha456', 'Porto'),
    ('Carlos Pereira', 'carlos.pereira@example.com', '914567890', 'Praça do Comércio, 789', 'carlos.jpg', 'legumes',
     '{"products": [{"nome": "batata", "quantidade": 50, "imagem": "batata.jpg", "preco": 0.5}, {"nome": "tomate", "quantidade": 30, "imagem": "tomate.jpg", "preco": 1.3}]}', 'senha789', 'Braga'),
    ('Ana Oliveira', 'ana.oliveira@example.com', '915678901', 'Rua dos Pomares, 321', 'ana.jpg', 'frutas e legumes',
     '{"products": [{"nome": "pera", "quantidade": 12, "imagem": "pera.jpg", "preco": 3.0}, {"nome": "abóbora", "quantidade": 8, "imagem": "abobora.jpg", "preco": 2.2}]}', 'senha321', 'Coimbra'),
    ('Rui Costa', 'rui.costa@example.com', '916789012', 'Rua Verde, 567', 'rui.jpg', 'cereais',
     '{"products": [{"nome": "arroz", "quantidade": 100, "imagem": "arroz.jpg", "preco": 5.0}, {"nome": "milho", "quantidade": 200, "imagem": "milho.jpg", "preco": 3.0}]}', 'senha654', 'Faro');



INSERT INTO client (name, email, phone, password, address)
VALUES
    ('John Doe', 'johndoe@example.com', '1234567890', 'password123', '123 Main St, Springfield'),
    ('Jane Smith', 'janesmith@example.com', '0987654321', 'securepass456', '456 Elm St, Metropolis'),
    ('Michael Brown', 'michaelbrown@example.com', '1122334455', 'mypassword789', '789 Oak St, Gotham'),
    ('Emily Davis', 'emilydavis@example.com', NULL, 'emily@123', '101 Pine St, Star City'),
    ('Chris Johnson', 'chrisjohnson@example.com', '5566778899', 'chrissecure456', '202 Maple St, Central City');



