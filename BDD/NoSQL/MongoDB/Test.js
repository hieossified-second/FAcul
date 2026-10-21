UsuariosTuff> db.Users.insertMany([{id: 1}, {Nome: 'Kevin'}, {idade: 18}, {Media: 7.60}]);
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId('6ad8c47385c8cc00750d819c'),
    '1': ObjectId('6ad8c47385c8cc00750d819d'),
    '2': ObjectId('6ad8c47385c8cc00750d819e'),
    '3': ObjectId('6ad8c47385c8cc00750d819f')
  }
}
UsuariosTuff> db.Users.insertMany([{id: 2}, {Nome: 'Stela'}, {idade: 40}, {Media: 10.0}]);
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId('6ad8c48d85c8cc00750d81a0'),
    '1': ObjectId('6ad8c48d85c8cc00750d81a1'),
    '2': ObjectId('6ad8c48d85c8cc00750d81a2'),
    '3': ObjectId('6ad8c48d85c8cc00750d81a3')
  }
}
UsuariosTuff> db.Users.find();
[
  { _id: ObjectId('6ad8c47385c8cc00750d819c'), id: 1 },
  { _id: ObjectId('6ad8c47385c8cc00750d819d'), Nome: 'Kevin' },
  { _id: ObjectId('6ad8c47385c8cc00750d819e'), idade: 18 },
  { _id: ObjectId('6ad8c47385c8cc00750d819f'), Media: 7.6 },
  { _id: ObjectId('6ad8c48d85c8cc00750d81a0'), id: 2 },
  { _id: ObjectId('6ad8c48d85c8cc00750d81a1'), Nome: 'Stela' },
  { _id: ObjectId('6ad8c48d85c8cc00750d81a2'), idade: 40 },
  { _id: ObjectId('6ad8c48d85c8cc00750d81a3'), Media: 10 }
]
