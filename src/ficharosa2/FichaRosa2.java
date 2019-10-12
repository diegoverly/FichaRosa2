/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficharosa2;

import java.io.*;
import com.linuxense.javadbf.*;
import ficharosa2.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.Types;

/**
 *
 * @author DiegoVerly
 */
public class FichaRosa2 {

    /**
     * @param args the command line arguments
     */
    
    int cont1, cont2;
    Connection conexao = null;
    PreparedStatement pst = null;

   
   

    public int roda() throws SQLException {

        File file = new File("C:\\database\\DBF\\DLOCLOD.DBF");

        DBFReader reader = null;

        String str = "insert into DLOCLOD (LD_CODIGO, LD_NOME, LD_CPF_CGC, LD_IDENT, LD_DT_NASC, LD_NACIONA, LD_EST_CIV, LD_PROFISS, LD_AC, "
                + "LD_ENDER, LD_BAIRRO, LD_CIDADE, LD_UF, LD_CEP, LD_TEL_RES, LD_TEL_COM, LD_TEL_CEL, LD_EMAIL, LD_TP_EXT, "
                + " LD_IN_CAPA, LD_LEAO, LD_JSSD, LD_BLO_CPG, LD_P_PROV, LD_NF, LD_DIMOB, LD_DIA_DEP, LD_TIP_CNT, LD_COD_BCO,"
                + " LD_COD_AGN, LD_NUM_CNT, LD_OBS_CNT, LD_FAVOREC, LD_CPF_FAV, FV_TIP_CNT, FV_COD_BCO, FV_COD_AGN, FV_NUM_CNT, "
                + "LD_STATUS, LD_FILIAL, LD_ATENDEN, LD_INI_ADM, LD_FIM_ADM, LD_ULT_MOV, LD_ANO_MES, LD_SAL_1, LD_SAL_2, LD_SAL_3,"
                + " LD_SAL_4, LD_SEQ_REC, LD_SEN_INI, LD_SEN_NET, LD_OBS1, LD_OBS2, LD_OBS3 ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        // String str = "insert into DLOCLOD (LD_CODIGO, LD_NOME, LD_CPF_CGC, LD_IDENT, LD_DT_NASC, LD_NACIONA, LD_EST_CIV, LD_PROFISS, LD_AC, LD_ENDER, LD_BAIRRO, LD_CIDADE, LD_UF, LD_CEP, LD_TEL_RES, LD_TEL_COM, LD_TEL_CEL, LD_EMAIL, LD_TP_EXT, LD_IN_CAPA, LD_LEAO, LD_JSSD, LD_BLO_CPG, LD_P_PROV, LD_NF, LD_DIMOB, LD_DIA_DEP, LD_TIP_CNT, LD_COD_BCO, LD_COD_AGN, LD_NUM_CNT, LD_OBS_CNT, LD_FAVOREC, LD_CPF_FAV, FV_TIP_CNT, FV_COD_BCO, FV_COD_AGN, FV_NUM_CNT, LD_STATUS, LD_FILIAL, LD_ATENDEN, LD_INI_ADM, LD_FIM_ADM, LD_ULT_MOV, LD_ANO_MES, LD_SAL_1, LD_SAL_2, LD_SAL_3, LD_SAL_4, LD_SEQ_REC, LD_SEN_INI, LD_SEN_NET, LD_OBS1, LD_OBS2, LD_OBS3) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        conexao = null;

        pst = null;

        conexao = ModuloConexao.conector();

        pst = conexao.prepareStatement(str);

        try {

            conexao.setAutoCommit(false);

            // create a DBFReader object
            reader = new DBFReader(new FileInputStream(file));

            // Now, lets us start reading the rows
            DBFRow row;

            while ((row = reader.nextRow()) != null) {

                pst.setString(1, row.getString("LD_CODIGO"));
                pst.setString(2, row.getString("LD_NOME"));
                pst.setString(3, row.getString("LD_CPF_CGC"));
                pst.setString(4, row.getString("LD_IDENT"));
                pst.setString(5, row.getString("LD_DT_NASC"));
                pst.setString(6, row.getString("LD_NACIONA"));
                pst.setString(7, row.getString("LD_EST_CIV"));
                pst.setString(8, row.getString("LD_PROFISS"));
                pst.setString(9, row.getString("LD_AC"));
                pst.setString(10, row.getString("LD_ENDER"));
                pst.setString(11, row.getString("LD_BAIRRO"));
                pst.setString(12, row.getString("LD_CIDADE"));
                pst.setString(13, row.getString("LD_UF"));
                pst.setString(14, row.getString("LD_CEP"));
                pst.setString(15, row.getString("LD_TEL_RES"));
                pst.setString(16, row.getString("LD_TEL_COM"));
                pst.setString(17, row.getString("LD_TEL_CEL"));
                pst.setString(18, row.getString("LD_EMAIL"));
                pst.setString(19, row.getString("LD_TP_EXT"));
                pst.setString(20, row.getString("LD_IN_CAPA"));
                pst.setString(21, row.getString("LD_LEAO"));
                pst.setString(22, row.getString("LD_JSSD"));
                pst.setString(23, row.getString("LD_BLO_CPG"));
                pst.setString(24, row.getString("LD_P_PROV"));
                pst.setString(25, row.getString("LD_NF"));
                pst.setString(26, row.getString("LD_DIMOB"));
                pst.setString(27, row.getString("LD_DIA_DEP"));
                pst.setString(28, row.getString("LD_TIP_CNT"));
                pst.setString(29, row.getString("LD_COD_BCO"));
                pst.setString(30, row.getString("LD_COD_AGN"));
                pst.setString(31, row.getString("LD_NUM_CNT"));
                pst.setString(32, row.getString("LD_OBS_CNT"));
                pst.setString(33, row.getString("LD_FAVOREC"));
                pst.setString(34, row.getString("LD_CPF_FAV"));
                pst.setString(35, row.getString("FV_TIP_CNT"));
                pst.setString(36, row.getString("FV_COD_BCO"));
                pst.setString(37, row.getString("FV_COD_AGN"));
                pst.setString(38, row.getString("FV_NUM_CNT"));
                pst.setString(39, row.getString("LD_STATUS"));
                pst.setString(40, row.getString("LD_FILIAL"));
                pst.setString(41, row.getString("LD_ATENDEN"));
                pst.setString(42, row.getString("LD_INI_ADM"));
                pst.setString(43, row.getString("LD_FIM_ADM"));
                pst.setString(44, row.getString("LD_ULT_MOV"));
                pst.setString(45, row.getString("LD_ANO_MES"));
                pst.setString(46, row.getString("LD_SAL_1"));
                pst.setString(47, row.getString("LD_SAL_2"));
                pst.setString(48, row.getString("LD_SAL_3"));
                pst.setString(49, row.getString("LD_SAL_4"));
                pst.setString(50, row.getString("LD_SEQ_REC"));
                pst.setString(51, row.getString("LD_SEN_INI"));
                pst.setString(52, row.getString("LD_SEN_NET"));
                pst.setString(53, row.getString("LD_OBS1"));
                pst.setString(54, row.getString("LD_OBS2"));
                pst.setString(55, row.getString("LD_OBS3"));

                pst.addBatch();
            }

            int[] count = pst.executeBatch();

            conexao.commit();

            conexao.setAutoCommit(true);

            //JOptionPane.showMessageDialog(null, "Banco preenchido!!!!! Registros inseridos:" + count.length);
            
           cont1 = count.length;
            
           

            // By now, we have iterated through all of the rows
        } catch (DBFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
            conexao.rollback();
        } finally {
            DBFUtils.close(reader);

            pst.close();
            conexao.close();

        }
        
        return cont1;

    }

    
    
    
    
    
    public int roda2() throws SQLException {

        File file2 = new File("C:\\database\\DBF\\DLOCIMO.DBF");

        DBFReader reader2 = null;

        String str2 = "insert into DLOCIMO (IM_CODIGO, IM_COD_LD, IM_PARTIC, IM_ENDER, IM_BAIRRO, IM_CIDADE, IM_UF, "
                + "IM_CEP, IM_MUNIC, IM_COM_RES, IM_TIPO, IM_AREA, IM_COD_LGR, IM_INS_EST, IM_INS_CBM, IM_NU_FORO, "
                + "IM_TELEF, IM_CEDAE, IM_INCEND, IM_NO_ADM, IM_CONTATO, IM_NO_CON, IM_CONDOM, IM_COD_SEG, IM_APOLICE, "
                + "IM_VCT_SEG, IM_TP_TX, IM_PERC_TX, IM_TX_MIN, IM_UNID_TX, IM_MES13TX, IM_PC_13TX, IM_STATUS, IM_ANUNCIA, "
                + "IM_IMO_GR, IM_COD_LT, IM_COD_FI, IM_NF, IM_DIMOB, IM_BCO_CAU, IM_AGN_CAU, IM_CNT_CAU, IM_P_TXFI, IM_P_TXAD, "
                + "IM_P_AD2, IM_INI_CTR, IM_FIM_CTR, IM_REV_CTR, IM_INDICE, IM_REAJUST, IM_MES_RJT, IM_ALU_ANT, IM_ALUGUEL, "
                + "IM_ALU_I_A, IM_DES_MUL, IM_DESCONT, IM_OP2, IM_PERC2, IM_DIA2, IM_DIA_VCT, IM_IND_JUR, IM_PAG_ADM, IM_IRRF, "
                + "IM_ANTECIP, IM_DEB_AUT, IM_BCO_DEB, IM_AGN_DEB, IM_CNT_DEB, IM_CPF_DB, IM_NOME_DB, IM_IN_COB, IM_IN_COR, IM_SEG_FIA, "
                + "IM_APO_FIA, IM_VCT_FIA, IM_MSG_REC, IM_BLO_CON, IM_ULT_MOV, IM_SEQ_REC, IM_SEN_INI, IM_SEN_NET, IM_ALU_VEN, "
                + "IM_ANU_INT, IM_DT_INC, IM_REGIAO, IM_TP_JR, IM_VAGAS, IM_POSICAO, IM_EST_IMO, IM_FOTOS, IM_VL_ANU, IM_VL_COND,"
                + " IM_VL_IPTU, IM_REF_ANU, IM_OBS_ANU, IM_VIS_ANU, IM_DES_ANU, IM_OBS1, IM_OBS2, IM_OBS3, IM_OBS4, IM_END_AN, "
                + "IM_AREA_AN ) values (? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,"
                + "? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? "
                + ",? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? )";

        // String str = "insert into DLOCLOD (LD_CODIGO, LD_NOME, LD_CPF_CGC, LD_IDENT, LD_DT_NASC, LD_NACIONA, LD_EST_CIV, LD_PROFISS, LD_AC, LD_ENDER, LD_BAIRRO, LD_CIDADE, LD_UF, LD_CEP, LD_TEL_RES, LD_TEL_COM, LD_TEL_CEL, LD_EMAIL, LD_TP_EXT, LD_IN_CAPA, LD_LEAO, LD_JSSD, LD_BLO_CPG, LD_P_PROV, LD_NF, LD_DIMOB, LD_DIA_DEP, LD_TIP_CNT, LD_COD_BCO, LD_COD_AGN, LD_NUM_CNT, LD_OBS_CNT, LD_FAVOREC, LD_CPF_FAV, FV_TIP_CNT, FV_COD_BCO, FV_COD_AGN, FV_NUM_CNT, LD_STATUS, LD_FILIAL, LD_ATENDEN, LD_INI_ADM, LD_FIM_ADM, LD_ULT_MOV, LD_ANO_MES, LD_SAL_1, LD_SAL_2, LD_SAL_3, LD_SAL_4, LD_SEQ_REC, LD_SEN_INI, LD_SEN_NET, LD_OBS1, LD_OBS2, LD_OBS3) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        conexao = null;

        pst = null;

        conexao = ModuloConexao.conector();

        pst = conexao.prepareStatement(str2);

        try {

            conexao.setAutoCommit(false);

            // create a DBFReader object
            reader2 = new DBFReader(new FileInputStream(file2));

            // Now, lets us start reading the rows
            DBFRow row2;

            while ((row2 = reader2.nextRow()) != null) {

                pst.setString(1, row2.getString("IM_CODIGO"));
                pst.setString(2, row2.getString("IM_COD_LD"));
                pst.setString(3, row2.getString("IM_PARTIC"));
                pst.setString(4, row2.getString("IM_ENDER"));
                pst.setString(5, row2.getString("IM_BAIRRO"));
                pst.setString(6, row2.getString("IM_CIDADE"));
                pst.setString(7, row2.getString("IM_UF"));
                pst.setString(8, row2.getString("IM_CEP"));
                pst.setString(9, row2.getString("IM_MUNIC"));
                pst.setString(10, row2.getString("IM_COM_RES"));
                pst.setString(11, row2.getString("IM_TIPO"));
                pst.setString(12, row2.getString("IM_AREA"));
                pst.setString(13, row2.getString("IM_COD_LGR"));
                pst.setString(14, row2.getString("IM_INS_EST"));
                pst.setString(15, row2.getString("IM_INS_CBM"));
                pst.setString(16, row2.getString("IM_NU_FORO"));
                pst.setString(17, row2.getString("IM_TELEF"));
                pst.setString(18, row2.getString("IM_CEDAE"));
                pst.setString(19, row2.getString("IM_INCEND"));
                pst.setString(20, row2.getString("IM_NO_ADM"));
                pst.setString(21, row2.getString("IM_CONTATO"));
                pst.setString(22, row2.getString("IM_NO_CON"));
                pst.setString(23, row2.getString("IM_CONDOM"));
                pst.setString(24, row2.getString("IM_COD_SEG"));
                pst.setString(25, row2.getString("IM_APOLICE"));
                pst.setString(26, row2.getString("IM_VCT_SEG"));
                pst.setString(27, row2.getString("IM_TP_TX"));
                pst.setString(28, row2.getString("IM_PERC_TX"));
                pst.setString(29, row2.getString("IM_TX_MIN"));
                pst.setString(30, row2.getString("IM_UNID_TX"));
                pst.setString(31, row2.getString("IM_MES13TX"));
                pst.setString(32, row2.getString("IM_PC_13TX"));
                pst.setString(33, row2.getString("IM_STATUS"));
                pst.setString(34, row2.getString("IM_ANUNCIA"));
                pst.setString(35, row2.getString("IM_IMO_GR"));
                pst.setString(36, row2.getString("IM_COD_LT"));
                pst.setString(37, row2.getString("IM_COD_FI"));
                pst.setString(38, row2.getString("IM_NF"));
                pst.setString(39, row2.getString("IM_DIMOB"));
                pst.setString(40, row2.getString("IM_BCO_CAU"));
                pst.setString(41, row2.getString("IM_AGN_CAU"));
                pst.setString(42, row2.getString("IM_CNT_CAU"));
                pst.setString(43, row2.getString("IM_P_TXFI"));
                pst.setString(44, row2.getString("IM_P_TXAD"));
                pst.setString(45, row2.getString("IM_P_AD2"));
                pst.setString(46, row2.getString("IM_INI_CTR"));
                pst.setString(47, row2.getString("IM_FIM_CTR"));
                pst.setString(48, row2.getString("IM_REV_CTR"));
                pst.setString(49, row2.getString("IM_INDICE"));
                pst.setString(50, row2.getString("IM_REAJUST"));
                pst.setString(51, row2.getString("IM_MES_RJT"));
                pst.setString(52, row2.getString("IM_ALU_ANT"));
                pst.setString(53, row2.getString("IM_ALUGUEL"));
                pst.setString(54, row2.getString("IM_ALU_I_A"));
                pst.setString(55, row2.getString("IM_DES_MUL"));
                pst.setString(56, row2.getString("IM_DESCONT"));
                pst.setString(57, row2.getString("IM_OP2"));
                pst.setString(58, row2.getString("IM_PERC2"));
                pst.setString(59, row2.getString("IM_DIA2"));
                pst.setString(60, row2.getString("IM_DIA_VCT"));
                pst.setString(61, row2.getString("IM_IND_JUR"));
                pst.setString(62, row2.getString("IM_PAG_ADM"));
                pst.setString(63, row2.getString("IM_IRRF"));
                pst.setString(64, row2.getString("IM_ANTECIP"));
                pst.setString(65, row2.getString("IM_DEB_AUT"));
                pst.setString(66, row2.getString("IM_BCO_DEB"));
                pst.setString(67, row2.getString("IM_AGN_DEB"));
                pst.setString(68, row2.getString("IM_CNT_DEB"));
                pst.setString(69, row2.getString("IM_CPF_DB"));
                pst.setString(70, row2.getString("IM_NOME_DB"));
                pst.setString(71, row2.getString("IM_IN_COB"));
                pst.setString(72, row2.getString("IM_IN_COR"));
                pst.setString(73, row2.getString("IM_SEG_FIA"));
                pst.setString(74, row2.getString("IM_APO_FIA"));
                pst.setString(75, row2.getString("IM_VCT_FIA"));
                pst.setString(76, row2.getString("IM_MSG_REC"));
                pst.setString(77, row2.getString("IM_BLO_CON"));
                pst.setString(78, row2.getString("IM_ULT_MOV"));
                pst.setString(79, row2.getString("IM_SEQ_REC"));
                pst.setString(80, row2.getString("IM_SEN_INI"));
                pst.setString(81, row2.getString("IM_SEN_NET"));
                pst.setString(82, row2.getString("IM_ALU_VEN"));
                pst.setString(83, row2.getString("IM_ANU_INT"));
                pst.setString(84, row2.getString("IM_DT_INC"));
                pst.setString(85, row2.getString("IM_REGIAO"));
                pst.setString(86, row2.getString("IM_TP_JR"));
                pst.setString(87, row2.getString("IM_VAGAS"));
                pst.setString(88, row2.getString("IM_POSICAO"));
                pst.setString(89, row2.getString("IM_EST_IMO"));
                pst.setString(90, row2.getString("IM_FOTOS"));
                pst.setString(91, row2.getString("IM_VL_ANU"));
                pst.setString(92, row2.getString("IM_VL_COND"));
                pst.setString(93, row2.getString("IM_VL_IPTU"));
                pst.setString(94, row2.getString("IM_REF_ANU"));
                pst.setString(95, row2.getString("IM_OBS_ANU"));
                pst.setString(96, row2.getString("IM_VIS_ANU"));
                pst.setString(97, row2.getString("IM_DES_ANU"));
                pst.setString(98, row2.getString("IM_OBS1"));
                pst.setString(99, row2.getString("IM_OBS2"));
                pst.setString(100, row2.getString("IM_OBS3"));
                pst.setString(101, row2.getString("IM_OBS4"));
                pst.setString(102, row2.getString("IM_END_AN"));
                pst.setString(103, row2.getString("IM_AREA_AN"));

                pst.addBatch();
            }

            int[] count2 = pst.executeBatch();

            conexao.commit();

            conexao.setAutoCommit(true);

          //  JOptionPane.showMessageDialog(null, "Banco preenchido!!!!! Registros inseridos:" 
                 //   +"\n"
                 //   + "\n" + cont1 + " registros inseridos na tabela DLOCLOD."
                  //  + "\n" + count2.length + " registros inseridos na tabela DLOCIMO.");
                      
                   cont2 = count2.length;             
            
            // By now, we have iterated through all of the rows
            
            
        } catch (DBFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
            conexao.rollback();
        } finally {
            DBFUtils.close(reader2);

            pst.close();
            conexao.close();

        }
return cont2;
    }
            

}
