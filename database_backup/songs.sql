--
-- PostgreSQL database dump
--

-- Dumped from database version 12.4 (Ubuntu 12.4-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.4 (Ubuntu 12.4-0ubuntu0.20.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: songs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.songs (
    id integer NOT NULL,
    artist_name character varying(100) NOT NULL,
    album character varying(100) NOT NULL,
    title character varying(100) NOT NULL,
    year integer NOT NULL,
    image character varying(255) NOT NULL,
    duration character varying(20) NOT NULL,
    video character varying(255)
);


ALTER TABLE public.songs OWNER TO postgres;

--
-- Name: songs_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.songs_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.songs_id_seq OWNER TO postgres;

--
-- Name: songs_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.songs_id_seq OWNED BY public.songs.id;


--
-- Name: songs id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.songs ALTER COLUMN id SET DEFAULT nextval('public.songs_id_seq'::regclass);


--
-- Data for Name: songs; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.songs (id, artist_name, album, title, year, image, duration, video) FROM stdin;
9	Leiva	Nuclear	En el espacio	2018	https://e-cdns-images.dzcdn.net/images/cover/60ace53f949c62b9fd4ad1bcde91f43a/380x380-000000-80-0-0.jpg	4:51	https://www.youtube.com/watch?v=jPxWg1PJ01I
25	The Paper Kites	Where You Live	Don't Keep Driving	2018	https://e-cdns-images.dzcdn.net/images/cover/bf4110f851cd2d41dc9f063e64a52e74/380x380-000000-80-0-0.jpg	5:20	https://www.youtube.com/watch?v=EsJE9g4vCRM
26	The verve	Urban Hymns	The drugs don't work	1997	https://e-cdns-images.dzcdn.net/images/cover/ecc7727e897198892b98e7c019fba45f/380x380-000000-80-0-0.jpg	5:24	https://www.youtube.com/watch?v=uL-jFKAg9AY
4	Cigarettes After Sex	Cigarettes After Sex	Affection	2014	https://e-cdns-images.dzcdn.net/images/cover/5fc176d490f7a6545a95569df6b05d91/380x380-000000-80-0-0.jpg	4:51	https://www.youtube.com/watch?v=5soixb2U6xM&list=LLffqXLkZMjzDwkCHvtw1Csg&index=1345
8	Queen	Forever	Love Of My Life	1990	https://e-cdns-images.dzcdn.net/images/cover/383cfb0cf6c5476bb2066440a9ecf3f6/380x380-000000-80-0-0.jpg	3:51	https://www.youtube.com/watch?v=vNsEEvRMtGI
10	Anabantha	Letanías III	Hechizo	2008	https://e-cdns-images.dzcdn.net/images/cover/3323c3bf77aed99ab8e6043a239c51cf/380x380-000000-80-0-0.jpg	3:53	https://www.youtube.com/watch?v=tm55WtIQLLA
1	Tierra Santa	Sangre de Reyes	El Amor de Mi Vida	2001	https://e-cdns-images.dzcdn.net/images/cover/16e2fc1986125094675315398acaaa0a/380x380-000000-80-0-0.jpg	4:51	https://www.youtube.com/watch?v=EBp3Cvflz5M
3	Lord Huron	The Night We Met	The Night We Met	2015	https://e-cdns-images.dzcdn.net/images/cover/52063207458668cc96ed7e79ef9c25a0/380x380-000000-80-0-0.jpg	3:28	https://www.youtube.com/watch?v=wGF7PswOENQ
5	Plain White Ts	All That We Needed	Hey There Delilah	2001	https://e-cdns-images.dzcdn.net/images/cover/eb229001b53f091320e511094279ab65/380x380-000000-80-0-0.jpg	3:56	https://www.youtube.com/watch?v=jF5lYn3QrKw
6	Zoé	Programaton	Andrómeda	2013	https://e-cdns-images.dzcdn.net/images/cover/bbe473a900d4e433928774052e59624a/380x380-000000-80-0-0.jpg	3:44	https://www.youtube.com/watch?v=oQi28S1Unlo
7	Mägo de Oz	La voz dormida	Desde mi cielo	2007	https://e-cdns-images.dzcdn.net/images/cover/f92821470bba8a60ec6ca9c30086c4ec/380x380-000000-80-0-0.jpg	6:20	https://www.youtube.com/watch?v=-y0L_8yf0_M
11	Bajo Sueños	Nada de Amor	Dama Imaginaria	1999	https://e-cdns-images.dzcdn.net/images/cover/8e2ab1d5a560593333a765078c580c97/380x380-000000-80-0-0.jpg	3:26	https://www.youtube.com/watch?v=PfsM3qslnjM
2	Gustavo Cerati	Colores Santos	Vuelta por el Universo	1992	https://cdn.domestika.org/c_fit,dpr_auto,f_auto,t_base_params,w_820/v1601333518/content-items/005/883/024/Gustavo-Cerati-Ilustraci%25C3%25B3n-original.png?1601333518	6:00	https://www.youtube.com/watch?v=ub_D_WM78GY
17	León Larregui	Voluma	Lattice	2016	https://e-cdns-images.dzcdn.net/images/cover/ab74e108fac8c84b6b8c453084ed5de5/380x380-000000-80-0-0.jpg	4:12	https://www.youtube.com/watch?v=muU5uklcoIQ
18	El Haragan	Valedores	No Estoy Muerto	1999	https://e-cdns-images.dzcdn.net/images/cover/4db5aeeb4b39eed42df9cb490ca6beff/380x380-000000-80-0-0.jpg	3:02	https://www.youtube.com/watch?v=jOkrJt5n7y8
19	Pedro Suarez-Vertiz	Play	Lo olvidé	2019	https://e-cdns-images.dzcdn.net/images/cover/bb24aaedb77d3bd14ae8fcee03db8b75/380x380-000000-80-0-0.jpg	3:58	https://www.youtube.com/watch?v=ywU9ERYCNZQ
20	Enrique Bunbury	MTV Unplugged	Ahora	2011	https://e-cdns-images.dzcdn.net/images/cover/bc9c2f3f31472a42ef1e4145f8fa1151/380x380-000000-80-0-0.jpg	5:37	https://www.youtube.com/watch?v=oG3A3VlGNj8
21	Passenger	Never say never	When we were young	2015	https://e-cdns-images.dzcdn.net/images/cover/c50bfdbbd129fd317e85b9441ae1dd9e/380x380-000000-80-0-0.jpg	3:37	https://www.youtube.com/watch?v=2lXhWcFSQRA
22	Mägo de Oz	Ira Dei	Bajo mi piel	2019	https://e-cdns-images.dzcdn.net/images/cover/916a45078a0709741c04a9198cbae7bd/380x380-000000-80-0-0.jpg	4:30	https://www.youtube.com/watch?v=HV7-pUromnY
23	Rata Blanca	La Puerta Secreta	Mamma	2006	https://e-cdns-images.dzcdn.net/images/cover/6a5ba1860de1855696ab28bffbad47c8/380x380-000000-80-0-0.jpg	6:08	https://www.youtube.com/watch?v=Jjp4ylTdEt0
24	Maná	Sueños Líquidos	Cómo dueles en los labios	1997	https://e-cdns-images.dzcdn.net/images/cover/f6cb42fd8287c36fcd0ebaf5d0a7fd63/380x380-000000-80-0-0.jpg	4:07	https://www.youtube.com/watch?v=VS1jtpxEzWc
\.


--
-- Name: songs_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.songs_id_seq', 26, true);


--
-- Name: songs songs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.songs
    ADD CONSTRAINT songs_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

