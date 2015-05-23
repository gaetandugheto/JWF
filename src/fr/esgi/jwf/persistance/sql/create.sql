create table UTILISATEUR (
  ID              serial             primary key             not null,
  NOM text                                                not null
);
alter table UTILISATEUR add constraint UTILISATEUR_UK unique (NOM);

create table NOTE (
  ID              serial             primary key             not null,
  TITRE           text                                    not null,
  NOTE            text                                    not null,
  ID_UTILISATEUR  int                                     not null
);
alter table NOTE add constraint NOTE_FK foreign key (ID_UTILISATEUR) references UTILISATEUR;