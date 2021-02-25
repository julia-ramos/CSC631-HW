using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerCollision : MonoBehaviour
{
    
    void OnCollisionEnter(Collision info) {
        if (info.collider.tag == "Wall") {
            Debug.Log("hit wall");
        }
    }

}
