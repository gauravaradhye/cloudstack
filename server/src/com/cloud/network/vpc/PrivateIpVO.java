// Copyright 2012 Citrix Systems, Inc. Licensed under the
// Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License.  Citrix Systems, Inc.
// reserves all rights not expressly granted by the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.network.vpc;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="private_ip_address")
public class PrivateIpVO{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    long id;
    
    @Column(name="ip_address", updatable=false, nullable=false)
    String ipAddress;
    
    @Column(name="mac_address")
    private long macAddress;
    
    @Column(name="taken")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date takenAt;
    
    @Column(name="network_id", updatable=false, nullable=false)
    private long networkId;
    
    public PrivateIpVO() {
    } 

    public PrivateIpVO(String ipAddress, long networkId, long macAddress) {
        this.ipAddress = ipAddress;
        this.networkId = networkId;
        this.macAddress = macAddress;
    }
    
    public void setTakenAt(Date takenDate) {
        this.takenAt = takenDate;
    }
    
    public String getIpAddress() {
        return ipAddress;
    }
   
    public long getNetworkId() {
        return networkId;
    }

    public Date getTakenAt() {
        return takenAt;
    }

    public long getId() {
        return id;
    }

    public long getMacAddress() {
        return macAddress;
    }
}
