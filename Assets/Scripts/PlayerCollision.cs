﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerCollision : MonoBehaviour {

    // reference to PlayerMovement script
    public PlayerMovement movement;

    void OnCollisionEnter(Collision collisionInfo) {
        if (collisionInfo.collider.tag == "Obstacle") {
            movement.enabled = false;
            FindObjectOfType<GameManager>().EndGame();
        }
    }

}