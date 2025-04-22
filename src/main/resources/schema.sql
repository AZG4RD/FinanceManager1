CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL DEFAULT 'ROLE_USER',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS categories (
    category_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    description VARCHAR(255),
    type VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS accounts (
    account_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    balance DECIMAL(14,2) NOT NULL,
    currency VARCHAR(10) NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS budgets (
    budget_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    category_id INTEGER NOT NULL,
    amount DECIMAL(14,2) NOT NULL,
    start_date DATE NOT NULL,
    en_date DATE NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY(category_id) REFERENCES categories(category_id) ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS transactions (
    transaction_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    category_id INTEGER NOT NULL,
    account_id INTEGER NOT NULL,
    amount DECIMAL(14,2) NOT NULL,
    date DATE NOT NULL,
    description VARCHAR(255),
    type VARCHAR(10) NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY(category_id) REFERENCES categories(category_id) ON DELETE RESTRICT,
    FOREIGN KEY(account_id) REFERENCES accounts(account_id) ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS diagrams(
    diagram_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    title VARCHAR(255) NOT NULL,
    type VARCHAR(10) NOT NULL,
    configuration TEXT NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(user_id) ON DELETE CASCADE
);