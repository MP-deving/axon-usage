CREATE TABLE IF NOT EXISTS favorite_animes (
    user_id UUID REFERENCES users(id) ON DELETE CASCADE,
    anime_id UUID REFERENCES animes(id) ON DELETE CASCADE,
    PRIMARY KEY (user_id, anime_id)
);