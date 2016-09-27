/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo;

import java.util.*;

public class JData
{
    private List<JRecord> data;
    
    public JData()
    {
        data = new ArrayList<>();
    }
    
    public List<JRecord> getData()
    {
        return data;
    }
    
    public void setData(List<JRecord> data)
    {
        this.data = data;
    }
}
