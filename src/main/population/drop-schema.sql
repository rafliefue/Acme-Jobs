
    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    alter table `sysconfig_spamwords` 
       drop 
       foreign key `FK6e5e9a9fukv21tqmsc010s2vw`;

    drop table if exists `administrator`;

    drop table if exists `announcement`;

    drop table if exists `anonymous`;

    drop table if exists `authenticated`;

    drop table if exists `challenge`;

    drop table if exists `commercial_banner`;

    drop table if exists `consumer`;

    drop table if exists `investor`;

    drop table if exists `non_commercial_banner`;

    drop table if exists `offer`;

    drop table if exists `provider`;

    drop table if exists `record`;

    drop table if exists `request`;

    drop table if exists `sysconfig`;

    drop table if exists `sysconfig_spamwords`;

    drop table if exists `user_account`;

    drop table if exists `hibernate_sequence`;
