package com.example.demo.dao;

import com.example.demo.model.Assemblie;
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
                "aant_trns_krimp, " +
                "lengte_trns_krimp) " +
                "VALUES (?, ?, 9999,9999,9999,9999,9999,9999,9999,9999)";
        jdbcTemplate.update(
                sql, id_assemblie, assemblie.getArtnr_kabel()
        );
        return 1;
    }

    @Override
    public List<Assemblie> getAssemblies() {
        return null;
    }

    @Override
    public int deleteAssemblieByIdAssemblie(UUID id_assemblie) {
        return 0;
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
