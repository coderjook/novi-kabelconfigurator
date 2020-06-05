package com.example.demo.dao;

import com.example.demo.model.Connector;
import com.example.demo.model.Haspel;
import com.example.demo.model.Kabel;
import com.example.demo.model.Tulegroep;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("kabelconfigurator")
public class KabelconfiguratorDB implements KabelDao, ConnectorDao, HaspelDao, TulegroepDao{

    private final JdbcTemplate jdbcTemplate;

    public KabelconfiguratorDB(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addConnector(Connector connector) {
        String sql = "" +
                "INSERT INTO connector (" +
                "artikelnummer, " +
                "typenummer, " +
                "connectortype, " +
                "kabelgroep, " +
                "merk, " +
                "tulegroep, " +
                "assemblage, " +
                "inkoopprijs, " +
                "prijsper, " +
                "configurator) " +
                "VALUES (?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(
                sql, connector.getArtikelnummer(), connector.getTypenummer(), connector.getConnectortype(),
                connector.getKabelgroep(), connector.getMerk(), connector.getTulegroep(),
                connector.getAssemblage(), connector.getInkoopprijs(), connector.getPrijsper(),
                connector.getConfigurator()
        );
        return 1;
    }

    @Override
    public List<Connector> getConnectors() {
        final String sql ="SELECT artikelnummer, typenummer, connectortype, kabelgroep, merk, tulegroep," +
                "assemblage, inkoopprijs, prijsper, configurator FROM Connector";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int artikelnummer = resultSet.getInt("artikelnummer");
            String typenummer = resultSet.getString("typenummer");
            String connectortype = resultSet.getString("connectortype");
            String kabelgroep = resultSet.getString("kabelgroep");
            String merk = resultSet.getString("merk");
            String tulegroep = resultSet.getString("tulegroep");
            String assemblage = resultSet.getString("assemblage");
            double inkoopprijs = resultSet.getDouble("inkoopprijs");
            int prijsper = resultSet.getInt("prijsper");
            String configurator = resultSet.getString("configurator");

            return new Connector(artikelnummer, typenummer, connectortype, kabelgroep, merk, tulegroep,
                    assemblage, inkoopprijs, prijsper, configurator
            );
        });
    }

    @Override
    public int deleteConnectorByArtikelnummer(int artikelnummer) {
        return 0;
    }

    @Override
    public int updateConnectorByArtikelnummer(Connector connector) {
        return 0;
    }

    @Override
    public int addKabel(Kabel kabel) {
        String sql = "" +
                "INSERT INTO Kabel (" +
                "artikelnummer, " +
                "typenummer, " +
                "merk, " +
                "kleur, " +
                "configurator, " +
                "kabelgroep, " +
                "inkoopprijs, " +
                "prijsper, " +
                "diameter_buitenmantel, " +
                "opmaak_aantal, " +
                "haspelgeschikt " +
                ") "+
                "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(
                sql, kabel.getArtikelnummer(), kabel.getTypenummer(), kabel.getMerk(), kabel.getKleur(),
                kabel.getConfigurator(), kabel.getKabelgroep(),kabel.getInkoopprijs(),
                kabel.getPrijsper(), kabel.getDiameter_buitenmantel(), kabel.getOpmaak_aantal(), kabel.isHaspelgeschikt()
        );
        return 1;
    }

    @Override
    public List<Kabel> getKabels() {
        final String sql ="SELECT artikelnummer, typenummer, merk, kleur,configurator, kabelgroep, " +
                "inkoopprijs, prijsper, diameter_buitenmantel, opmaak_aantal, haspelgeschikt FROM Kabel";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int artikelnummer = resultSet.getInt("artikelnummer");
            String typenummer = resultSet.getString("typenummer");
            String merk = resultSet.getString("merk");
            String kleur = resultSet.getString("kleur");
            String configurator = resultSet.getString("configurator");
           String kabelgroep = resultSet.getString("kabelgroep");
            double inkoopprijs = resultSet.getDouble("inkoopprijs");
            int prijsper = resultSet.getInt("prijsper");
            double diameter_buitenmantel = resultSet.getDouble("diameter_buitenmantel");
            int opmaak_aantal = resultSet.getInt("opmaak_aantal");
            boolean haspelgeschikt = resultSet.getBoolean("haspelgeschikt");
            return new Kabel(artikelnummer, typenummer, merk, kleur, configurator, kabelgroep,
                    inkoopprijs, prijsper, diameter_buitenmantel, opmaak_aantal, haspelgeschikt);
        });
    }

    @Override
    public int deleteKabelByArtikelnummer(int artikelnummer) {
            String sql = "" +
                "DELETE FROM Kabel " +
                "WHERE artikelnummer = ?";
        return jdbcTemplate.update(sql, artikelnummer);
    }

    @Override
    public int updateInkoopprijsKabelByArtikelnummer(Kabel kabel) {
        String sql = "" +
                "UPDATE Kabel " +
                "SET typenummer = ? " +
                "WHERE artikelnummer = ?";
        return jdbcTemplate.update(sql, kabel.getTypenummer(), kabel.getArtikelnummer());
    }

    @Override
    public int addHaspel(Haspel haspel) {
        String sql = "" +
                "INSERT INTO Haspel (" +
                "artikelnummer, " +
                "typenummer, " +
                "merk, " +
                "configurator, " +
                "inkoopprijs, " +
                "prijsper, " +
                "breedte_haspel, " +
                "diameter_kern_haspel, " +
                "diameter_haspel " +
                ") "+
                "VALUES (?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(
                sql, haspel.getArtikelnummer(), haspel.getTypenummer(), haspel.getMerk(),
                haspel.getConfigurator(), haspel.getInkoopprijs(), haspel.getPrijsper(), haspel.getBreedte_haspel(),
                haspel.getDiameter_kern_haspel(), haspel.getDiameter_haspel()
        );
        return 1;
    }

    @Override
    public List<Haspel> getHaspels() {
        final String sql ="SELECT artikelnummer, typenummer, merk, configurator, " +
                "inkoopprijs, prijsper, breedte_haspel, diameter_kern_haspel, diameter_haspel FROM Haspel";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int artikelnummer = resultSet.getInt("artikelnummer");
            String typenummer = resultSet.getString("typenummer");
            String merk = resultSet.getString("merk");
            String configurator = resultSet.getString("configurator");
            double inkoopprijs = resultSet.getDouble("inkoopprijs");
            int prijsper = resultSet.getInt("prijsper");
            double breedte_haspel = resultSet.getDouble("breedte_haspel");
            double diameter_kern_haspel = resultSet.getDouble("diameter_kern_haspel");
            double diameter_haspel = resultSet.getDouble("diameter_haspel");
            return new Haspel(artikelnummer, typenummer, merk, configurator, inkoopprijs, prijsper, breedte_haspel,
                    diameter_kern_haspel, diameter_haspel);
        });
    }

    @Override
    public int addTulegroep(Tulegroep tulegroep) {
        String sql = "" +
                "INSERT INTO Tulegroep (" +
                "artikelnummer, " +
                "typenummer, " +
                "merk, " +
                "kleur, " +
                "configurator, " +
                "assemblagekosten, " +
                "tulegroep " +
                ") "+
                "VALUES (?,?,?,?,?,?,?)";
        jdbcTemplate.update(
                sql, tulegroep.getArtikelnummer(), tulegroep.getTypenummer(), tulegroep.getMerk(), tulegroep.getKleur(),
                tulegroep.getConfigurator(), tulegroep.getAssemblagekosten(), tulegroep.getTulegroep()
        );
        return 1;
    }

    @Override
    public List<Tulegroep> getTulegroep() {
        final String sql ="SELECT artikelnummer, typenummer, merk, kleur, configurator, " +
                "assemblagekosten, tulegroep FROM Tulegroep";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int artikelnummer = resultSet.getInt("artikelnummer");
            String typenummer = resultSet.getString("typenummer");
            String merk = resultSet.getString("merk");
            String kleur = resultSet.getString("kleur");
            String configurator = resultSet.getString("configurator");
            double assemblagekosten = resultSet.getDouble("assemblagekosten");
            String tulegroep = resultSet.getString("tulegroep");
            return new Tulegroep(artikelnummer, typenummer, merk, kleur, configurator, assemblagekosten, tulegroep);
        });
    }
}