package com.example.demo.dao;

import com.example.demo.model.Assemblie;
import com.example.demo.model.Connector;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("kabelconfiguratorassemblie")
public class KableconfiguratorAssemblie implements AssemblieDao {

    private final JdbcTemplate jdbcTemplate;

    public KableconfiguratorAssemblie(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public int addAssemblie(UUID id_assemblie, Assemblie assemblie) {
        String sql = "" +
                "INSERT INTO Assemblie (" +
                " id_assemblie, " +
                " artnr_kabel, " +
                "lengte_kabel, " +
                "artnr_connector_a, " +
                "artnr_connector_b, " +
                "artnr_afw_conn_a, " +
                "artnr_afw_conn_b, " +
                "artnr_haspel, " +
                "trans_krimp, " +
                "lengte_trans_krimp, " +
                "artnr_assemblie)" +
                "VALUES (?, ?, ?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(
                sql, id_assemblie, assemblie.getArtnr_kabel(), assemblie.getLengte_kabel(), assemblie.getArtnr_connector_a(),
                assemblie.getArtnr_connector_b(),assemblie.getArtnr_afw_conn_a(),assemblie.getArtnr_afw_conn_b(),
                assemblie.getArtnr_haspel(),assemblie.getTrans_krimp(),assemblie.getLengte_trans_krimp(),assemblie.getArtnr_assemblie());
        return 1;
    }

    @Override
    public List<Assemblie> getAssemblies() {
        final String sql ="SELECT id_assemblie, artnr_kabel, lengte_kabel, artnr_connector_a, artnr_connector_b, artnr_afw_conn_a, " +
                "artnr_afw_conn_b, artnr_haspel, trans_krimp, lengte_trans_krimp,artnr_assemblie FROM Assemblie";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id_assemblie = (UUID) resultSet.getObject("id_assemblie");
            int artnr_kabel = resultSet.getInt("artnr_kabel");
            double lengte_kabel = resultSet.getDouble("lengte_kabel");
            int artnr_connector_a = resultSet.getInt("artnr_connector_a");
            int artnr_connector_b = resultSet.getInt("artnr_connector_b");
            int artnr_afw_conn_a = resultSet.getInt("artnr_afw_conn_a");
            int artnr_afw_conn_b = resultSet.getInt("artnr_afw_conn_b");
            int artnr_haspel = resultSet.getInt("artnr_haspel");
            String trans_krimp = resultSet.getString("trans_krimp");
            int lengte_trans_krimp = resultSet.getInt("lengte_trans_krimp");
            long artnr_assemblie = resultSet.getLong("artnr_assemblie");

           return new Assemblie(id_assemblie, artnr_kabel, lengte_kabel, artnr_connector_a, artnr_connector_b, artnr_afw_conn_a,
                    artnr_afw_conn_b, artnr_haspel, trans_krimp, lengte_trans_krimp,artnr_assemblie );
        });
    }

    @Override
    public int deleteAssemblieByArtikelnummer(UUID id_assemblie) {
        String sql = "" +
                "DELETE FROM Assemblie " +
                "WHERE id_assemblie = ?";
        return jdbcTemplate.update(sql, id_assemblie);
    }

    @Override
    public int updateKabelByIdAssemblie(Assemblie assemblie) {

         String sql = "" +
                    "UPDATE Assemblie " +
                    "SET artnr_kabel = ?," +
                    "lengte_kabel = ?" +
                    "WHERE id_assemblie = ?";
            return jdbcTemplate.update(sql, assemblie.getArtnr_kabel(), assemblie.getLengte_kabel(), assemblie.getId_assemblie());
        }

    @Override
    public int updateHaspelByIdAssemblie(Assemblie assemblie) {
                String sql = "" +
                "UPDATE Assemblie " +
                "SET artnr_haspel = ?" +
                "WHERE id_assemblie = ?";
        return jdbcTemplate.update(sql, assemblie.getArtnr_haspel(), assemblie.getId_assemblie());
    }

    @Override
    public int updateConnectorAByIdAssemblie(Assemblie assemblie) {
        String sql = "" +
                "UPDATE Assemblie " +
                "SET artnr_connector_a = ?," +
                "artnr_afw_conn_a = ?" +
                "WHERE id_assemblie = ?";
        return jdbcTemplate.update(sql, assemblie.getArtnr_connector_a(), assemblie.getArtnr_afw_conn_a(), assemblie.getId_assemblie());
    }


    @Override
    public int updateConnectorBByIdAssemblie(Assemblie assemblie) {
        String sql = "" +
                "UPDATE Assemblie " +
                "SET artnr_connector_b = ?," +
                "artnr_afw_conn_b = ?" +
                "WHERE id_assemblie = ?";
        return jdbcTemplate.update(sql, assemblie.getArtnr_connector_b(), assemblie.getArtnr_afw_conn_b(), assemblie.getId_assemblie());
    }

    @Override
    public int updateAfwerkingByIdAssemblie(Assemblie assemblie) {
        String sql = "" +
                "UPDATE Assemblie " +
                "SET trans_krimp = ?," +
                "lengte_trans_krimp = ?" +
                "WHERE id_assemblie = ?";
        return jdbcTemplate.update(sql, assemblie.getTrans_krimp(), assemblie.getLengte_trans_krimp(), assemblie.getId_assemblie());
    }

}
