-- public.semana definition

-- Drop table

-- DROP TABLE public.semana;

CREATE TABLE public.semana (
	id bigserial NOT NULL,
	data_final timestamp NULL,
	data_inicio timestamp NULL,
	etapa_id int4 NULL,
	CONSTRAINT semana_pkey PRIMARY KEY (id)
);


-- public."time" definition

-- Drop table

-- DROP TABLE public."time";

CREATE TABLE public."time" (
	id bigserial NOT NULL,
	icone varchar(255) NULL,
	nome varchar(255) NULL,
	sigla varchar(255) NULL,
	CONSTRAINT time_pkey PRIMARY KEY (id)
);


-- public.jogador definition

-- Drop table

-- DROP TABLE public.jogador;

CREATE TABLE public.jogador (
	id bigserial NOT NULL,
	foto varchar(255) NULL,
	nick varchar(255) NULL,
	nome varchar(255) NULL,
	time_id int8 NULL,
	role_id int4 NULL,
	sobrenome varchar(255) NULL,
	CONSTRAINT jogador_pkey PRIMARY KEY (id),
	CONSTRAINT fklilj7k5o0e2b7urhcgb9i260k FOREIGN KEY (time_id) REFERENCES public."time"(id)
);


-- public.jogo definition

-- Drop table

-- DROP TABLE public.jogo;

CREATE TABLE public.jogo (
	id bigserial NOT NULL,
	blue_side_id int8 NULL,
	red_side_id int8 NULL,
	semana_id int8 NULL,
	hora_inicio time NULL,
	bagre_id int8 NULL,
	mvp_id int8 NULL,
	CONSTRAINT jogo_pkey PRIMARY KEY (id),
	CONSTRAINT fk28015wt14ax8nltpmxsdwrl18 FOREIGN KEY (mvp_id) REFERENCES public.jogador(id),
	CONSTRAINT fkeapypcm4d2uyqi0kyvygekbmq FOREIGN KEY (semana_id) REFERENCES public.semana(id),
	CONSTRAINT fko0cvxoc7dwlp0nv6pjoc9xwp7 FOREIGN KEY (bagre_id) REFERENCES public.jogador(id),
	CONSTRAINT fkp6fqn1ruukl5v4mchbgfd0xed FOREIGN KEY (red_side_id) REFERENCES public."time"(id),
	CONSTRAINT fksunl2jnty3dla9jrfglt88qh1 FOREIGN KEY (blue_side_id) REFERENCES public."time"(id)
);


-- public.jogo_semana definition

-- Drop table

-- DROP TABLE public.jogo_semana;

CREATE TABLE public.jogo_semana (
	id bigserial NOT NULL,
	jogo_id int8 NULL,
	semana_id int8 NULL,
	CONSTRAINT jogo_semana_pkey PRIMARY KEY (id),
	CONSTRAINT fk23ho5wfoce4xidbahfbwsdhsw FOREIGN KEY (jogo_id) REFERENCES public.jogo(id),
	CONSTRAINT fkqkmob46ss5bh9ct93qbc71uw FOREIGN KEY (semana_id) REFERENCES public.semana(id)
);


-- public.jogador_jogo_semana definition

-- Drop table

-- DROP TABLE public.jogador_jogo_semana;

CREATE TABLE public.jogador_jogo_semana (
	id bigserial NOT NULL,
	nota float8 NOT NULL,
	jogador_id int8 NULL,
	jogo_semana_id int8 NULL,
	CONSTRAINT jogador_jogo_semana_pkey PRIMARY KEY (id),
	CONSTRAINT fkbcic1eeu5ys9kd7u5hhpqcykv FOREIGN KEY (jogador_id) REFERENCES public.jogador(id),
	CONSTRAINT fkf78gjd1d2nj7s5v7n9ocxveii FOREIGN KEY (jogo_semana_id) REFERENCES public.jogo_semana(id)
);